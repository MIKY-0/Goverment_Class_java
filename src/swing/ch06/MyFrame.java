package swing.ch06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements Runnable{
    private JLabel backgroundMap;
    private JLabel player;
    private JLabel enemy;

    // 캐릭터 , 적 L / R
    ImageIcon playerIconL = new ImageIcon("images/playerL.png");
    ImageIcon playerIconR = new ImageIcon("images/playerR.png");
    ImageIcon enemyIconL = new ImageIcon("images/enemyL.png");
    ImageIcon enemyIconR = new ImageIcon("images/enemyR.png");

    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("이미지 겹치기 연습");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지 설정해보기.
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);

        // 배치관리자 좌표 ==> 컴포넌트 사이즈와 위치를 직접 지정해야함.
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        // 플레이어 이미지 초기화.
        ImageIcon playerIcon = new ImageIcon("images/playerL.png");
        player = new JLabel(playerIconL);
        player.setSize(100, 100);
        player.setLocation(200, 510);

        // 적 생성
        enemy = new JLabel(enemyIconL);
        enemy.setSize(100 , 100);
        enemy.setLocation(600 , 510);
    }

    private void setInitLayout() {
        // 루트 패널의 설정
        setLayout(null);
        add(backgroundMap);
        backgroundMap.add(player);
        backgroundMap.add(enemy);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                final int MOVE = 5;
                int x = player.getX();
                int y = player.getY();
                boolean out = (player.getX() < 0 || 930 <= player.getX()) ||
                              (player.getY() < 0 || 540 <= player.getY());

                    if (out) {
                        player.setLocation(200 , 510);
                    } else if (code == KeyEvent.VK_LEFT ) {
                        player.setIcon(playerIconL);
                        player.setLocation(x - MOVE, y);
                    } else if (code == KeyEvent.VK_RIGHT) {
                        player.setIcon(playerIconR);
                        player.setLocation(x + MOVE, y);
                    } else if (code == KeyEvent.VK_UP) {
                        player.setLocation(x, y - MOVE);
                    } else if (code == KeyEvent.VK_DOWN) {
                        player.setLocation(x, y + MOVE);
                    }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    @Override
    public void run() {

            int x = enemy.getX();
            int y = enemy.getY();
            final int SPEED = 3;
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(x <= 10) {
                enemy.setIcon(enemyIconR);
               x += SPEED;
               enemy.setLocation(x , y);
            } else if(x >= 890) {
                enemy.setIcon(enemyIconL);
                x -= SPEED;
                enemy.setLocation(x , y);
            } else if(enemy.getIcon() == enemyIconR){
                x += SPEED;
                enemy.setLocation(x , y);
            } else if(enemy.getIcon() == enemyIconL) {
                x -= SPEED;
                enemy.setLocation(x , y);
            }
        }
    }

    public static void main(String[] args) {
        new MyFrame();
        new Thread(new MyFrame()).start();
    }

}
