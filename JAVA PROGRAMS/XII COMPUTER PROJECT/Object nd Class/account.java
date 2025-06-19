import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the attributes
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an Account object with user input
        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter the account holder's name: ");
        String holderName = scanner.nextLine();
        System.out.print("Enter the initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Account account = new Account(accountNumber, holderName, initialBalance);

        // Displaying account details
        account.display();

        // Testing deposit and withdraw methods
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Displaying updated account details
        System.out.println("\nUpdated Account Details:");
        account.display();

        scanner.close();
    }
}
