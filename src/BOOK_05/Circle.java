package BOOK_05;
public class Circle {
        static double PI = 3.14159265;//类变量定义
        int radius;
        public double circumference(){
            return  2*PI*radius;//类变量使用
        }
}
