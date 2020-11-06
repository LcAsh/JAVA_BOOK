package BOOK_05;

public class Point {
    //01
   /* void point() {
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
    }*/
/*
//02
    //其他构造方法
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    //其他成员方法
     static void main(String[] args) {
        Point p =new Point(1,1);
         System.out.println("p.distance() = " + p.distance());
         p = new Point3d(1,1,1);
         System.out.println("p.distance() = " + p.distance());
    }
    static class Point3d extends Point{
        public double distance(){
            return Math.sqrt(x*x + y*y + z*z);
        }
    }*/

//03
    void print(){
        System.out.println("This is the superclass!");
    }

    public static void main(String[] args) {
        Point superp = new Point();
        superp.print();
        Point3d subp = new Point3d();
        subp.print();
    }
}
 class Point3d extends Point{
    void print(){
        System.out.println("This is the subclass!");
        super.print();
    }
 }
