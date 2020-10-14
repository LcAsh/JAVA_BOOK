public class Test3_Rectangle extends Test1_Shap2D {

    protected float h,w;
    public Test3_Rectangle(float xx, float yy,float hh,float ww) {
        super(xx, yy);
        this.h=hh;
        this.w=ww;
    }

    public float Area(){
        return (float) h*w;
    }
}
