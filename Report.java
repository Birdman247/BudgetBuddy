public class Report {
    private Budget budget;

    public Report(Budget budget) {
        this.budget = budget;
    }

    public String generateReport() {
        return "Income: " + budget.getTotalIncome() + "\nExpenses: " + budget.getTotalExpenses() + "\nBalance: " + budget.getBalance();
    }
}
