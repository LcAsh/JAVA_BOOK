package BOOK_03;

public class Customer {
    /*说明变量屏蔽及作用域实例
     */
    public static void main(String[] args) {
        Customer customer = new Customer();
        {
            String name = "Tom David";
            customer.name = name;
            System.out.println("The customer's name: " + customer.name);
        }
       String name = "John Smith";
        customer.name = name;
        System.out.println("The customer's name: " + customer.name);
    }
    private String name;
}
