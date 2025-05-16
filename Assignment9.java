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
public String generateReport() {
    return "Income: " + totalIncome + "\nExpenses: " + totalExpenses + "\nBalance: " + balance;
}
public void saveTransactionsToFile(List<Transaction> transactions) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"))) {
        for (Transaction t : transactions) {
            writer.write(t.getAmount() + "," + t.getType() + "," + t.getCategory() + "\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
