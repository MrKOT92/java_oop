public class Main {

  public static void main(String[] args) {
    Soda drink = new Soda("Malina");
    System.out.println("adaus dupa creare: " + drink.getSupplement());
    drink.setSupplement("cireasa");
    System.out.println("adaus dupa schimbari: " + drink.getSupplement());
  }
}