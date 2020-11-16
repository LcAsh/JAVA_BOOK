package BOOK_08;
import javax.swing.*;
import java.awt.*;

public class ActionEventDemo {
    public static void main(String[] args) {
        JFrame frame =new JFrame("ActionEvent Demo");
        JButton b = new JButton("Press me");

        //注册时间监听程序
        b.addActionListener(new ButtonHandler());

        frame.getContentPane().add(b, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
