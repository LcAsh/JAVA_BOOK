package BOOK_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IntDouble_02 {
    //计算BMI
    public static void main(String[] args) {
        int age;
        double weight, height, bmi;
        Scanner scan = new Scanner(System.in);

        System.out.println("你的年龄是：");
        age = scan.nextInt();

        System.out.println("你的体重是（公斤）：");
        weight = scan.nextDouble();

        System.out.println("你的身高是（米）:");
        height = scan.nextDouble();

        bmi = weight / (height*height);
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("BMI：" + fmt.format(bmi));
    }
}
