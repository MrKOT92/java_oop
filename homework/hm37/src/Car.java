public class Car {

  private String brand;
  private int year;

  private static int totalNumberOfCars = 0;
  private static double price = 25000.0;

  public Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
    totalNumberOfCars++;
  }

  public static int getTotalNumberOfCars() {
    return totalNumberOfCars;
  }

  public static double getPrice() {
    return price;
  }

  public static void setPrice(double newPrice) {
    price = newPrice;
  }

  public void increasePrice(double amount) {
    price += amount;
  }

  public void decreasePrice(double amount) {
    price -= amount;
    if (price < 0) {
      price = 0;


    }
  }

  public String getBrand() {
    return brand;
  }

  public int getYear() {
    return year;
  }
}