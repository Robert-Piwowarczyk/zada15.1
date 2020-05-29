import java.math.BigDecimal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SalesUtil {
    String fileName = ("objects.csv");

    public static List<ProductPrice> readProdcutPricesFromFile(String fileName) {
        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            String[] parts = nextLine.split(",");
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }

            ProductPrice productPrice = new ProductPrice(parts[0], BigDecimal.ofValue(parts[1]),
                    BigDecmal.ofValue(parts[2]));

            System.out.println("Ceny produktu: " + productPrice);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
