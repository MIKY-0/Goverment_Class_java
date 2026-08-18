package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
//    private JButton button1;
//    private JButton button2;
//    private JButton button3;
    private JButton[] btns;


//    public MyFrame() {
//        super.setTitle("배치 관리자 연습");
//        super.setSize(600 , 300);
//        super.setVisible(true);
//        initData();
//        setInitLayout();
//    }

    public MyFrame(JButton[] btns) {
        super.setTitle("배치 관리자 연습");
        super.setSize(600 , 300);
        super.setVisible(true);
        this.btns = btns;
        initData();
        setInitLayout();
    }


    public void initData() {
//        button1 = new JButton("button1");
//        button2 = new JButton("button2");
//        button3 = new JButton("button3");

        for(int i = 0; i < btns.length; i++) {
            btns[i] = new JButton("button" + (i + 1));
        }
    }

    public void setInitLayout() {
        // 배치 관리자 선언.
        FlowLayout flowLayout = new FlowLayout();

        // 컴포넌트들을 수평 , 수직으로 프레임 배치해줌.
        super.setLayout(flowLayout);
//        super.add(button1);
//        super.add(button2);
//        super.add(button3);

        for(JButton b : btns) {
            add(b);
        }
    }

    public static void main(String[] args) {
//        MyFrame frame1 = new MyFrame();
        new MyFrame(new JButton[5]);
    }
}
