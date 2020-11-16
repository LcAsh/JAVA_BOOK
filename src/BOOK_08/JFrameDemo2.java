package BOOK_08;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrameDemo2");//创建一个JFrame的实例
        JButton button = new JButton("Press me");//创建一个JButton的实例
        JPanel contentPane = new JPanel();//创建一个JPanel的实例

        //为JPanel设置BorderLayout布局管理器
        contentPane.setLayout(new BorderLayout());

        //将JButton放到JPanel的中央
        contentPane.add(button,BorderLayout.CENTER);

        //为JFrame设置新的内容窗格
        frame.setContentPane(contentPane);

        frame.pack();//将JFrame设置到适当的大小
        frame.setVisible(true);//显示JFrame
    }
}
