import java.util.Date;
public class Transactions {
    protected Date dateTrans;
    protected char type;
    protected double amount;
    protected double balance;
    protected String description;

    public Transactions(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateTrans = new Date();
    }

    public Date getDateCreated() {
        return dateTrans;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateTrans = dateCreated;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
