package BOOK_06;
class MyException extends Exception{
    private int detail;
   MyException (int a){
       detail = a;
   }
}

class ExceptionDemo {
    static void compute(int a )throws MyException{
        System.out.println("Calles compute("+a+".");
        if(a>10)throw new MyException(a);
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println("Exception caught"+e.toString());
        }
    }
}
