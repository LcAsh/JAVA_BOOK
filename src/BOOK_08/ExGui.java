package BOOK_08;

import javax.swing.*;
import java.awt.*;

public class ExGui {
    private JFrame frame;
    private JButton b1;
    private JButton b2;

    public static void main(String[] args) {
        ExGui that = new ExGui();//创建一个ExGui实例
        that.go();
    }

    public void go(){
        frame = new JFrame("GUI example");//创建一个JFrame实例
        Container contentPane = frame.getContentPane();//获取内容窗格

        //为内容窗格设置FlowLayout布局管理器
        contentPane.setLayout(new FlowLayout());

        b1=new JButton("Press me");//创建JButton实例
        b2=new JButton("Don't press Me");

        contentPane.add(b1);//添加按钮
        contentPane.add(b2);

        frame.pack();//使框架frame设定一个适当的大小
        frame.setVisible(true);//使框架frame及所包含的组件对用户可见
    }
}
