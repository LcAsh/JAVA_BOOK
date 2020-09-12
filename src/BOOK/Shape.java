package BOOK;

import java.awt.*;

public class Shape {
    abstract class shape {
        abstract void draw();
        Point position;
        Shape (Point p){
            position = p;
        }
    }
        abstract class Round extends Shape {
            final double pi = 3.14159265;
            abstract void draw();
            abstract double area();
        }
        class Circle extends Round{
            int radius;
            void draw() {
                drawCircle(position);
            }
            double area() {
                return pi*radius*radius;
            }
            Circle (Point p, int radius){
                super (p);
                this.radius = radius;
            }
        }
}

