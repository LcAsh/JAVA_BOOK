package BOOK;

public class Count {
    private int serialNumber;
    private static int counter = 0;
    public void Count (){
        counter++;
        serialNumber = counter;
    }
}
