package swing.ch02;


import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {
        MyComponent m = new MyComponent();
        m.run();

        JTextField field = m.getTextField();
        field.setText("홍길동");
    }
}
