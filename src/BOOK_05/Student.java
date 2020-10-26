package BOOK_05;

public class Student {
    String name;
    int age;

    public Student(String s, int n){
        name = s;
        age = n;
    }
    public Student(String s){
        this(s,20);//将控制权转给第一个构造方法，并提供字符串参数和int型参数
    }
    public Student(){
        this("Unknown");//将控制权转给只带一个字符串参数的构造方法
    }
}
