package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBorderFrameArray extends JFrame{
    private JButton[] btns;
    private String[] positions = {BorderLayout.NORTH , BorderLayout.SOUTH , BorderLayout.CENTER ,
                                    BorderLayout.WEST , BorderLayout.EAST};
    private BorderLayout borderLayout;

    public MyBorderFrameArray(JButton[] btns) {
        setTitle("borderLayout 배열 연습");
        setSize(600 , 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x창 누르면 프로그램도 종료.
        this.btns = btns;
        initData();
        setInitLayout();
    }

    public void initData() {
        this.borderLayout = new BorderLayout();
        for(int i = 0; i < btns.length; i++) {
            btns[i] = new JButton("버튼" + (i + 1));
        }
    }

    // 배치관리자 선정하고 Frame 설정.
    public void setInitLayout() {
        setLayout(borderLayout); // Frame에 배치관리자 설정.
        for(int i = 0; i < btns.length; i++) {
                add(btns[i] , positions[i]);
        }
    }

    public static void main(String[] args) {
        new MyBorderFrameArray(new JButton[5]);
    }
}


