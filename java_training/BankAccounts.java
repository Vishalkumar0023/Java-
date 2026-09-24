import java.util.*;
class BankAccount {
    int Balance = 8483;
    String deposit(int amount) {
        Balance = Balance + amount;
        return "After the deposit the Balance is " + Balance;
    }
    String withdraw(int amount) {
        if (amount > Balance && amount>0) {
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
public class BankAccounts {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount();
        int choice;
        do {
            System.out.println("\nBANK MENU ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();
                    System.out.println(acc1.deposit(depositAmount));
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = sc.nextInt();
                    System.out.println(acc1.withdraw(withdrawAmount));
                    break;

                case 3:
                    acc1.printDetails();
                    break;

                case 4:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}