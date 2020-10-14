public class Test2_Circle extends Test1_Shap2D {
    protected float r;
    public Test2_Circle(float xx, float yy,float rr) {
        super(xx, yy);
        this.r =rr;
    }

    public float Area(){
        return (float) (Math.PI*r*r);
    }
}
