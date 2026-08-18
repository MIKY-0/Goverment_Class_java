package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBorderFrame extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private BorderLayout borderLayout;

    public MyBorderFrame() {
        setTitle("borderLayout 연습");
        setSize(600 , 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x창 누르면 프로그램도 종료.
        initData();
        setInitLayout();
    }

    public void initData() {
        this.borderLayout = new BorderLayout();
        button1 = new JButton("버튼1");
        button2 = new JButton("버튼2");
        button3 = new JButton("버튼3");
        button4 = new JButton("버튼4");
        button5 = new JButton("버튼5");
    }

    // 배치관리자 선정하고 Frame 설정.
    public void setInitLayout() {
        setLayout(borderLayout); // Frame에 배치관리자 설정.
        add(button1 , BorderLayout.NORTH);
        add(button2 , BorderLayout.SOUTH);
        add(button3 , BorderLayout.CENTER);
        add(button4 , BorderLayout.WEST);
        add(button5 , BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new MyBorderFrame();
    }
}
