package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveLabelFrame extends JFrame {
    private JLabel label;
    private final int MOVE_STEP = 10;
    private int cnt;

    public MoveLabelFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("방향키로 별 움직이기 연습 | 이동횟수 : " + cnt);
        setSize(500 , 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        label = new JLabel("☆");
        label.setFont(new Font("맑은 고딕" , Font.BOLD , 30));

        // 좌표기반 - 크기 , 위치(직접 설정해야함)
        label.setSize(50 , 50); // 사이즈
        label.setLocation(200 , 200); // 시작 위치
    }

    private void setInitLayout() {
        setLayout(null); // null -> 좌표기반
        add(label);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("☆");
                int code = e.getKeyCode();
                int x = label.getX();
                int y = label.getY();
                if(code == KeyEvent.VK_UP) {
                    label.setLocation(x  , y - MOVE_STEP); // 시작 위치
                    cnt ++;
                } else if(code == KeyEvent.VK_LEFT) {
                    label.setLocation(x - MOVE_STEP , y);
                    cnt++;
                } else if(code == KeyEvent.VK_RIGHT) {
                    label.setLocation(x + MOVE_STEP , y);
                    cnt++;
                } else if(code == KeyEvent.VK_DOWN) {
                    label.setLocation(x  , y + MOVE_STEP);
                    cnt++;
                } else if(code == KeyEvent.VK_ESCAPE){
                    label.setLocation(225 , 200);
                    cnt = 0;
                }
                setTitle("방향키로 별 움직이기 연습 | 이동횟수 : "  + cnt);

            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("★");
            }
        });
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    public static void main(String[] args) {
        new MoveLabelFrame();
    }

}
