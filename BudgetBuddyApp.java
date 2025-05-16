import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Date;

public class BudgetBuddyApp extends Application {

    private Budget budget = new Budget();
    private Report report = new Report(budget);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Budget Buddy");

        TextField amountField = new TextField();
        amountField.setPromptText("Enter Amount");

        TextField categoryField = new TextField();
        categoryField.setPromptText("Enter Category");

        Button addIncomeButton = new Button("Add Income");
        Button addExpenseButton = new Button("Add Expense");
        Button generateReportButton = new Button("Generate Report");

        TextArea reportArea = new TextArea();
        reportArea.setEditable(false);

        addIncomeButton.setOnAction(e -> {
            double amount = Double.parseDouble(amountField.getText());
            String category = categoryField.getText();
            Transaction transaction = new Transaction(amount, "Income", category, new Date());
            budget.addTransaction(transaction);
            amountField.clear();
            categoryField.clear();
        });

        addExpenseButton.setOnAction(e -> {
            double amount = Double.parseDouble(amountField.getText());
            String category = categoryField.getText();
            Transaction transaction = new Transaction(amount, "Expense", category, new Date());
            budget.addTransaction(transaction);
            amountField.clear();
            categoryField.clear();
        });

        generateReportButton.setOnAction(e -> {
            String reportText = report.generateReport();
            reportArea.setText(reportText);
        });

        VBox layout = new VBox(10, amountField, categoryField, addIncomeButton, addExpenseButton, generateReportButton, reportArea);
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
