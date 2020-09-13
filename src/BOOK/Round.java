package BOOK;
import java.awt.*;
    abstract class Round extends Shape {
        final double pi = 3.14159265;
        abstract void draw();
        abstract double area();
        Round(Point p){
            super(p);
        }
    }

    class Circle extends Round{
        int radius;
        void draw() {
            drawCircle(position);
        }

        private void drawCircle(Point position) {
        }

        double area() {
            return pi*radius*radius;
        }
        Circle (Point p, int radius){
            super (p);
            this.radius = radius;
        }
    }

