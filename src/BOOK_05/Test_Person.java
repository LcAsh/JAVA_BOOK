package BOOK_05;

import java.util.Vector;

public class Test_Person {
    public static void main(String[] args) {
        Employee jim = new Employee();
        jim.name = "jim";
        System.out.println(jim.getName());
        Manager betty = new Manager();
        betty.name = "betty";
        betty.employeeNumber = 56789;
        betty.responsibilities = new Vector();
        betty.responsibilities.add("Internet project");
        System.out.println(betty.getName());
        System.out.println(betty.getEmployeeNumber());
    }
}
