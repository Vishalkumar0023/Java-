import java.util.*;
class BankAccount {
    int Balance = 0;
    String deposit(int amount) {
        Balance = Balance + amount;
        return "After the deposit the Balance is " + Balance;
    }
    String withdraw(int amount) {
        if (amount > Balance) {
            return "Insufficient Balance";
        } else {
            Balance = Balance - amount;
            return "Balance Amount after withdrawal " + Balance;
        }
    }
    void printDetails() {
        System.out.println("Account Balance: " + Balance);
    }
}
public class BankAccounts{
    public static void main(String args[]){
        BankAccount acc1 = new BankAccount();
        System.out.println(acc1.deposit(3000));
        System.out.println(acc1.withdraw(1000));
        acc1.printDetails();
    }
}