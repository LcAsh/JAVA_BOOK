package BOOL_04;

public class StringTest {
    public static void main(String[] args) {
        String str = "This is the first string.";
        boolean resultl = str.equals("This is the first string.");
        boolean result2 = str.equals("this is the first string.");
        boolean result3 = str.equalsIgnoreCase("this is the first string.");

        System.out.println("result1 =" + resultl);
        System.out.println("result2 =" + result2);
        System.out.println("result3 =" + result3);
    }
}
