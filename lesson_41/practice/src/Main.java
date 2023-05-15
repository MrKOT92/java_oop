public class Main {

  public static void main(String[] args)
  {
    Fish fish = new Fish("Dorado");
    System.out.println("Type: " + fish.getType());
    System.out.println("Length: " + fish.getLength() + "cm");
    System.out.println("Weight: " + fish.getWeight() + "g");
  }
}