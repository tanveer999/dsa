package BankAccount.BankAccount.src;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int num = 5;
        while(num > 0) {
            System.out.println(num);
            num--;
        }

        Account a = new Account();

        a.name = "Tanveer";

        System.out.println(a.name);
    }
}
