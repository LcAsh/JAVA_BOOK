package BOOK_08;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrameDemo");//创建一个JFrame的实例
        JButton button = new JButton("Press me");//创建一个JButton的实例

        //将JButton放到JFrame的中央
        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.pack();//将JFrame设置到适当的大小
        frame.setVisible(true);//显示JFrame
    }
}
