public abstract class Test1_Shap2D {
    //图形位置
    protected  float x,y;
    public Test1_Shap2D(float xx, float yy){
        this.x=xx;
        this.y=yy;
    }
    //求图形的面积
    public abstract float Area();
    //求与另一个图形的距离
    public float distance(Test1_Shap2D shap){
        float d=0;
        d=(float) Math.sqrt(Math.pow(x-shap.getX(),2)+Math.pow(y-shap.getY(),2));
        return d;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
