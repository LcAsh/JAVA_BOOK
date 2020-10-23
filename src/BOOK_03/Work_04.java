package BOOK_03;

public class Work_04 {
    public static int factorial (int n){
        int s = 1;
        if(n==0){
            System.out.println(n+"的阶乘是0");
        }
        for(int i = 1;i<=n; i++){
           s=s*i;
        }
        return s;
    }
    public static void main(String[] args) {
        int a=2, b=4, c= 6, d=8, e=10;
        System.out.println(a+"的阶乘是"+ Work_04.factorial(a));
        System.out.println(b+"的阶乘是"+ Work_04.factorial(b));
        System.out.println(c+"的阶乘是"+ Work_04.factorial(c));
        System.out.println(d+"的阶乘是"+ Work_04.factorial(d));
        System.out.println(e+"的阶乘是"+ Work_04.factorial(e));
    }
}
