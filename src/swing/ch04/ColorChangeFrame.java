package swing.ch04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JPanel panel1;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500 , 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        panel1 = new JPanel();
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());
        panel1.setBackground(Color.YELLOW);
        panel1.add(button1);
        panel1.add(button2);
        add(panel1);
        setVisible(true);
    }

    private void addEventListener() {
        button1.addActionListener(this); // button1 객체에 이벤트리스너 등록.
        button2.addActionListener(this); // button2 객체에 이벤트리스너 등록.
    }


    // ActionListener의 추상메서드를 구현 메서드로 재정의.
    // 미리 약속돼있는 메서드 , 즉 어떤 이벤트가 발생하면 이 해당 메서드가 동작되도록 설계됨.(콜백 메서드)
    // 콜백함수 : 어떤 이벤트가 일어나면 동작.
    @Override
    public void actionPerformed(ActionEvent e) {
        Object selected1 = e.getSource();
        if(selected1 == button1) {
            panel1.setBackground(Color.BLACK);
        }  else {
            panel1.setBackground(Color.WHITE);
        }
//         selected.setText("이벤트발생");
    }

    public static void main(String[] args) {
        new ColorChangeFrame();
    }
}
