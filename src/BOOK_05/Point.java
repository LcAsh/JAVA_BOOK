package BOOK_05;

public class Point {
    void point() {
        System.out.println("This is the superclass!");
    }
    public static void main(String args[]){
        Point superp = new Point();
        superp.point();
        Point3d subp = new Point3d();
        subp.print();
    }
    private static class Point3d extends Point{
        void print(){
            System.out.println("This is the subclass!");
        }
    }
}
