public class Account {
    // Question No 4
    private double Balance;

    // No-argument constructor
    public Account() {
    }

    // Two-argument constructor
    public Account(double initialbalance) {
        Balance = initialbalance;
    }

    // Method to deposit
    public void deposit(double amount) {
        Balance += amount;
    }

    // Method to withdraw
    public void withdraw(double amount) {
        Balance -= amount;
    }

    // Main method
    public static void main(String[] args) {
        // Create an account object using the no-argument constructor
        Account account1 = new Account();
        Account account2 = new Account(1000.0);

        // Deposit 500
        account1.deposit(500.0);

        // Withdraw 200
        account2.withdraw(200.0);

        // Printing balance
        System.out.println("Account 1 Balance: " + account1.Balance);
        
        System.out.println("Account 2 Balance: " + account2.Balance);
    }
}

/*
 Output

Account 1 Balance: 500.0
Account 2 Balance: 800.0
 */