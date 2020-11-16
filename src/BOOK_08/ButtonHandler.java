package BOOK_08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    @Override
    //出现ActionEvent事件时，下面方法将被调用
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action occurred");
    }
}
