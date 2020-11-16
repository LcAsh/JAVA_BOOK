package BOOK_06;

public class HellowWord {
    public static void main(String[] args) {
        int i = 0;
        String greetings [] = {
                "Hello world!",
                "No, I mena it!",
                "HELLO WORLD!!"
        };

        while (i<4){
            try {
                System.out.println(greetings[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Resetting Index Value");
                i = -1;//使其能反复执行
            }catch (Exception e ){
                System.out.println(e.toString());
            }finally {
                System.out.println("This is always printed");
            }
            i++;
        }//While循环结束
    }//主函数main结束
}
