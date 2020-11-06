package BOOK_05;

public class SuperClass {
    void showMyPosition(){
        System.out.println("I am in superclass!");
        System.out.println("I will go back now ...");
    }
}
class SubClass extends SuperClass{
    void showMyPosition(){
        System.out.println("At first I will go to superclass ...");
        super.showMyPosition();
        System.out.println("Now I have moved to subclass!");
    }
}

