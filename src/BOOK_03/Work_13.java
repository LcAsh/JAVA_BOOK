package BOOK_03;

import java.util.Scanner;

public class Work_13 {
    public static void main(String[] args) {
        double a1 , a2, a3;
        Scanner scan = new Scanner(System.in);
        System.out.println("请依次输入三角形的三边长：");
        a1 = scan.nextDouble();
        a2 = scan.nextDouble();
        a3 = scan.nextDouble();

        double s, area;
        s = (a1 + a2 + a3 )/2;
        area = Math.sqrt(s*(s-a1)*(s-a2)*(s-a3));
        System.out.println("边长为：" + a1 + "," + a2 + "," + a3 + "的三角形的面积是：" + area);
    }
}
