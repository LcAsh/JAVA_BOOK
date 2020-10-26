package BOOK_05;

 class BankAccount {
    String ownerName;
    int accountNumber;
    float balance;
}

public class BankTester{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.ownerName = "Wangli";
        myAccount.accountNumber = 1000234;
        myAccount.balance = 2000.00f;
        System.out.println("ownerName=" + myAccount.ownerName);
        System.out.println("accountNumber=" + myAccount.accountNumber);
        System.out.println("balance=" + myAccount.balance);
    }
}
