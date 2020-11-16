package BOOK_08;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    private JFrame frame;
    private JButton be,bw,bn,bs,bc;

    public static void main(String[] args) {
        BorderLayoutDemo that=new BorderLayoutDemo();
        that.go();
    }

    public void go(){
        frame = new JFrame("Border Layout");
        be=new JButton("East");
        bs=new JButton("South");
        bw=new JButton("West");
        bn=new JButton("North");
        bc=new JButton("Center");

        frame.getContentPane().add(be, BorderLayout.EAST);//添加按钮到东部
        frame.getContentPane().add(bs, BorderLayout.SOUTH);//添加按钮到南部
        frame.getContentPane().add(bw, BorderLayout.WEST);//添加按钮到西部
        frame.getContentPane().add(bn, BorderLayout.NORTH);//添加按钮到南部
        frame.getContentPane().add(bc, BorderLayout.CENTER);//添加按钮到中部

        frame.setSize(350,200);
        frame.setVisible(true);
    }
}
