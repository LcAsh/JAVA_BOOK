package BOOK_08;

import javax.swing.*;
import java.awt.*;

public class ActionEventDemo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Demo2");

        //创建自定义组件MyButton的实例
        MyButton b =new MyButton("Close");

        frame.getContentPane().add(b, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

    }
}
