package swing.ch06;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame2 extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;
    private JLabel enemy;
    private final int MOVE_STEP = 10;


    // 플레이어 이미지 L , R
    ImageIcon playerIconL = new ImageIcon("images/playerL.png");
    ImageIcon playerIconR = new ImageIcon("images/playerR.png");
    ImageIcon enemyIconL = new ImageIcon("images/enemyL.png");
    ImageIcon enemyIconR = new ImageIcon("images/enemyR.png");

    public MyFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("이미지 겹치기 연습");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지 설정해보기
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        // 배치 관리자 좌표 ==> 컴포넌트 사이즈와 위치를 직접 지정해야 한다.
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        // 플레이어 이미지 초기화
        playerIconL = new ImageIcon("images/playerL.png");
        player = new JLabel(playerIconL);
        player.setSize(100, 100);
        player.setLocation(200, 510);

        // 적 생성
        enemy = new JLabel(enemyIconL);
    }

    private void setInitLayout() {
        // 루트 패널에 설정
        setLayout(null);
        add(backgroundMap);

        backgroundMap.add(player);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int x = player.getX();
                int y = player.getY();

                switch(e.getKeyCode()) {
                    case KeyEvent.VK_UP :
                        y -= MOVE_STEP;
                        break;
                    case KeyEvent.VK_LEFT :
                        player.setIcon(playerIconL);
                        x -= MOVE_STEP;
                        break;
                    case KeyEvent.VK_RIGHT :
                        player.setIcon(playerIconR);
                        x += MOVE_STEP;
                        break;
                    case KeyEvent.VK_DOWN :
                        y += MOVE_STEP;
                        break;

                    default : return;
                }
                player.setLocation(x , y);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }


    // 테트스 코드
    public static void main(String[] args) {
        new MyFrame2();
    }

}
