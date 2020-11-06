package BOOK_05;
class Count{
    int serialNumber;
    static int counter = 0;
    public Count(){
        counter++;
        serialNumber = counter;
    }
}
public class UseStatic {
    public static void main(String[] args) {
        System.out.println("Count.counter is "+ Count.counter);
        //类变量的使用
        Count Tom = new Count();
        Count John = new Count();
        System.out.println("Tom's serialNumber is " + Tom.serialNumber);
        System.out.println("John's serialNumber is " + John.serialNumber);
        System.out.println("Now Count.counter is " + Count.counter);
    }
}
