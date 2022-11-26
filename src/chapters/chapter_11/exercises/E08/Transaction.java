package chapters.chapter_11.exercises.E08;
import java.util.Date;
public class Transaction{
    public static final char WITHDRAW = 'W';
    public static final char DEPOSIT = 'D';
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public  Transaction() {
        this(Transaction.DEPOSIT, 0, 0);
        date = new Date();
    }

    public Transaction( char type, double balance, double amount) {
        this.type = type;
        this.balance = balance;
        this.description = this.getDescripton();
        date = new Date();
    }
    public String getDescripton() {
        return this.date.toString() + "\n" +  (this.type== 'W' ? "Withdraw" : "Deposit") + "\n-------------\n"
                + "Amount : "  + this.amount + "\nBalance : " + this.balance;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
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

}
