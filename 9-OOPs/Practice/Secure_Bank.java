package Practice;

class Bank {
    int accountNumber;
    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    Bank(int accNo, int bal) {
        this.accountNumber = accNo;
        this.balance = bal;
    }
}

public class Secure_Bank {
    public static void main(String[] args) {
        Bank b1 = new Bank(101,5000);

        b1.deposit(2000);
        System.out.println(b1.getBalance());
    }
}
