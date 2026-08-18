package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {
    // 중첩 클래스활용.
    MySwing mySwing;

    public SwingFrame() {
        setTitle("중첩클래스 활용");
        setSize(700 , 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mySwing = new MySwing();
        add(mySwing);
        setVisible(true);
    }

    // 2. 정적 내부클래스 선언
    static class MySwing extends JPanel{
        private Image image;

        public MySwing () {
            image = new ImageIcon("tree.png").getImage();
        }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawString("이미지게임(집만들기)" , 250 , 100);
            g.drawRect(300 , 300 , 200 , 200);
            g.drawRect(340 , 340 , 40 , 40);
            g.drawLine(300 , 300 , 400 , 200);
            g.drawLine(400 , 200 , 500 , 300);
            g.drawRoundRect(50 , 50 , 70 , 70 , 200 , 200);
            g.drawImage(image , 70 , 210 , 200 , 300 , null);
        }
    }

    public static void main(String[] args) {
        new SwingFrame();
    }

}
