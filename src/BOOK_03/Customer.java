package BOOK_03;

public class Customer {
    /*说明变量屏蔽及作用域实例
     */
    public static void main(String[] args) {
        Customer customer = new Customer();
        String name = "John Smith";
        {
            //下面的说明是非法的，仍在前面一个name的作用域内
            String name  = "Tom David";
            customer.name = name;
            System.out.println("The customer's name: " + customer.name);
        }
        private String name;
    }
}
