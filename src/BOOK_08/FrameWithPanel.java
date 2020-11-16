package BOOK_08;

import javax.swing.*;
import java.awt.*;

public class FrameWithPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame with Panel");
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.CYAN);//将JFrame实例的背景设置为     蓝绿色

        JPanel panel = new JPanel();//创建一个JPanel的实例
        panel.setBackground(Color.yellow);//将JPanel实例的背景设置为黄色

        JButton button = new JButton("Press me ");
        panel.add(button);//将JButton实例添加到JPanel中

        //将JPanel实例添加到JFrame的南侧
        contentPane.add(panel,BorderLayout.SOUTH);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
