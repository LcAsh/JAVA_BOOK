package BOOK_08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {
    public MyButton (String text){
        super(text);

        //注册事件的监听程序
        addActionListener(this);
    }

    //出现ActionEvent事件时，将结束程序的运行
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
