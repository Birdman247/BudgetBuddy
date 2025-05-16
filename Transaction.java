import java.util.Date;

public class Transaction {
    private double amount;
    private String type; 
    private String category;
    private Date date;

    public Transaction(double amount, String type, String category, Date date) {
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toCSV() {
        return amount + "," + type + "," + category + "," + date.toString();
    }
}
