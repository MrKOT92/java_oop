import java.util.ArrayList;
import java.util.List;

class Product {
  private final String name;
  private final String category;
  private double price;
  private final List<Double> priceHistory;

  public Product(String name, String category, double price) {
    this.name = name;
    this.category = category;
    this.price = price;
    this.priceHistory = new ArrayList<>();
    this.priceHistory.add(price);
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
      this.priceHistory.add(price);
    }
  }

  public List<Double> getPriceHistory() {
    return priceHistory;
  }
}