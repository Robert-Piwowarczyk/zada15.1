import java.io.FileNotFoundException;
import java.util.List;

class salesStatement {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = ("objects.csv");

        List<ProductPrice> productPrices = SalesUtil.readProdcutPricesFromFile(fileName);
        System.out.println("Ceny produktów: " + productPrices);
    }
}

