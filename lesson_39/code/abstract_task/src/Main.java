public class Main {

  public static void main(String[] args) {
Product product = new Alcohol(10, "Best Tequila", 70);
Product product1 = new Tire(120, "GoodYear Tire", false,17);
    System.out.println(product.discount());
    System.out.println(product1.discount());
  }
}
