import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    // create some products
    Product product1 = new Product("Lime", "Fruits", 1.99);
    Product product2 = new Product("Iphone 14", "Electronics", 1780.99);
    Product product3 = new Product("Puma Sweater", "Clothing", 32.59);

    List<Product> productList = new ArrayList<>();
    productList.add(product1);
    productList.add(product2);
    productList.add(product3);

    Map<String, Double> productPriceMap = generateProductPriceMap(productList);

    for (String productName : productPriceMap.keySet()) {
      System.out.println(productName + " - " + productPriceMap.get(productName));
    }

    product2.setPrice(1580.99);
    System.out.println(product2.getName() + " - " + product2.getPrice());
    System.out.println("Price with discount for " + product2.getName() + ": " + product2.getPriceHistory());
  }

  public static Map<String, Double> generateProductPriceMap(List<Product> productList) {
    Map<String, Double> productPriceMap = new HashMap<>();
    for (Product product : productList) {
      productPriceMap.put(product.getName(), product.getPrice());
    }
    return productPriceMap;
  }
}