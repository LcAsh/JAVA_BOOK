package BOOK;

import java.awt.*;


    abstract class Shape {
        abstract void draw();
        Point position;
        Shape (Point p){
            position = p;
        }
    }


