class BankAccount {
    private int accountNumber;
    private int balance;
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void deposit(int deposit1) {
        balance = balance + deposit1;
    }
    public void withdraw(int withdraw1) {
        if (balance >= withdraw1 && balance>0) {
            balance = balance - withdraw1;
        } else {
            System.out.println("Insufficient amount");
        }
    }
    public int getBalance() {
        return balance;
    }
}
public class EncapQ1 {
    public static void main(String args[]) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(12345);
        b.deposit(5000);
        System.out.println("Balance: " + b.getBalance());
        b.withdraw(2000);
        System.out.println("Balance after withdrawal: " + b.getBalance());
        b.withdraw(5000);
    }
}