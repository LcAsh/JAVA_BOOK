package BOOK_03;

import java.util.Scanner;

public class Echo {
    //读入字符串并返回显在屏幕上
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner( System.in);
        System.out.println("Enter a line of text:");
        message = scan.nextLine();

        System.out.println("You entered: \"" + message + "\"");

    }
}
