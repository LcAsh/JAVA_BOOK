package BOOK_02;

public class MyGraphic {
    static double PI = 3.1415;
    double longth;//长
    double wideth;//宽
    double radius;//半径
    double highth;//高
    double circle;//周长
    double volume;//体积
    double area;//面积

    public void setLongth(double longth) {
        this.longth = longth;
    }
    public void setWideth(double wideth) {
        this.wideth = wideth;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHighth(double highth) {
        this.highth = highth;
    }

    public double Circle(double radius){
        return (PI * radius * radius);
    }//周长
    public double Volume1 (double longth, double wideth, double highth){
        return (longth * wideth * highth);
    }//长方体的体积计算
    public double Area (double longth, double wideth){
        return (longth * wideth);
    }

}

class Rectangular extends MyGraphic{//定义矩形类

    public  void main(String[] args) {
        longth = 4;
        wideth = 5;
        area = Area(longth, wideth);
        System.out.println("长为：" + longth + ",宽为：" + wideth + "的矩形的面积为：" + area);

    }
}

