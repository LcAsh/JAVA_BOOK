package BOOK_05;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class TowListenInner {
    private Frame f;
    private TextField tf;

    public static void main(String[] args) {
        TowListenInner that = new TowListenInner();
        that.go();
    }
    public void go(){
        f= new Frame("Two listeners example");
        f.add("North",new Label("Click and drag the mouse"));
        tf= new TextField(30);
        f.add("South",tf);
        f.addMouseMotionListener(new MouseMotionHandler());
        f.addMouseListener(new MouseEventHandler());
        f.setSize(300,200);
        f.setVisible(true);
    }
    //MouseMotionHandler为一个内部类
    public class MouseMotionHandler extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            String s ="Mouse dragging: X="+e.getX() + "Y=" +e.getY();
            tf.setText(s);
        }
    }
    //MouseEventHandler为一个内部类
    public class MouseEventHandler extends MouseAdapter{
        public void mouseEntered(MouseEvent e){
            String s = "The mouse entered";
            tf.setText(s);
        }
        public void mouseExited (MouseEvent e){
            String s ="The mouse has left the building";
            tf.setText(s);
        }
    }
}
