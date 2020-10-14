import java.util.Vector;

public class Test4_Out {
    public static void main(String[] args) {
        Test1_Shap2D sh = new Test2_Circle(3.0f, 4.0f, 9.0f);
        Test1_Shap2D re = new Test3_Rectangle(6.0f, 5.9f, 10f, 8f);
        Vector<Test1_Shap2D> vec = new Vector<Test1_Shap2D>();
        System.out.println(sh.Area());
        System.out.println(re.Area());
        System.out.println("两个图形间的距离" + sh.distance(re));
    }


}
