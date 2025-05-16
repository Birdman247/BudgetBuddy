import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataPersistence {

    public void saveTransactionsToFile(List<Transaction> transactions) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv"))) {
            writer.write("Amount,Type,Category,Date\n");

            for (Transaction transaction : transactions) {
                writer.write(transaction.toCSV() + "\n");
            }

            System.out.println("Transactions saved to transactions.csv");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Transaction> loadTransactionsFromFile() {
        return null; 
    }
}
