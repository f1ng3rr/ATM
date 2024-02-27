import java.util.ArrayList;
import java.util.Date;
public class Account {
    protected int id;
    protected double balance;
    protected static double annualInterestRate;
    protected Date dateCreated;
    protected ArrayList<Transactions> transactions = new ArrayList<>();
    protected String name;

    public Account() {
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transactions('-', amount, balance, ""));
    }
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transactions('+', amount, balance, ""));
    }

}
