package BOOK_08;

import javax.swing.*;
import java.awt.*;

public class BoxDemo {
    private JFrame frame;
    private Box bv,bh;

    public static void main(String[] args) {
        BoxDemo that = new BoxDemo();
        that.go();
    }

    void go(){
        frame = new JFrame("Box Layout example");
        Container contentPane = frame.getContentPane();

        //创建使用垂直方向 BOxLayout的Box实例
        bv=Box.createVerticalBox();

        bv.add(new JLabel("  Monday"));
        bv.add(new JLabel("  Tuesday"));
        bv.add(new JLabel("  Wednesday"));
        bv.add(new JLabel("  Thursday"));
        bv.add(new JLabel("  Friday"));
        bv.add(new JLabel("  Saturday"));
        bv.add(new JLabel("  Sunday"));

        contentPane.add(bv,BorderLayout.CENTER);

        //创建使用水平方向BOxLayout的Box实例
        bh=Box.createHorizontalBox();
        bh.add(new JButton("Yes"));
        bh.add(new JButton("No"));
        bh.add(new JButton("Cancel"));

        contentPane.add(bh,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
