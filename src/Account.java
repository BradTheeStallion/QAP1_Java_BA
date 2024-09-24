//Bradley Ayers
//QAP 1
//September 24, 2024

public class Account {
    String id, name;
    int balance;

    // Default Constructor
    public Account() {
        this.id = "abc123";
        this.name = "Brad Ayers";
        this.balance = 0;
    }

    // Parameterized Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0; // Set default balance to 0
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Methods
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void credit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("New Balance: $" + getBalance());
        } else {
            System.out.println("Credit amount must be positive.");
        }
    }

    public boolean debit(int amount) {
        if (amount <= 0) {
            System.out.println("Debit amount must be positive.");
            return false;
        }
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("New Balance: $" + getBalance());
            return true;
        } else {
            System.out.println("Amount Exceeded Balance ($" + getBalance() + ")");
            return false;
        }
    }

    public void transferTo(Account another, int amount) {
        if (this.debit(amount)) {
            another.credit(amount);
        }
    }

    public String toString() {
        return "id = " + getId() + ", name = " + getName() + ", balance = $" + getBalance();
    }
}