public class Budget {
    private double totalIncome;
    private double totalExpenses;
    private double balance;

    public Budget() {
        totalIncome = 0;
        totalExpenses = 0;
        balance = 0;
    }

    public void addTransaction(Transaction t) {
        if (t.getType().equals("Income")) {
            totalIncome += t.getAmount();
        } else {
            totalExpenses += t.getAmount();
        }
        updateBalance();
    }

    private void updateBalance() {
        balance = totalIncome - totalExpenses;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public double getBalance() {
        return balance;
    }
}
