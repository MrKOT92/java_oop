public class Main {

  public static void main(String[] args) {

    ClamDiver diver1 = new ClamDiver("John Snow");
    diver1.dive();
    System.out.println(diver1.getName() + " collected " + diver1.getPearls() + " pearls.");

    ClamDiver diver2 = new ClamDiver("Daynaris Targarien");
    diver2.dive();
    System.out.println(diver2.getName() + " collected " + diver2.getPearls() + " pearls.");

    ClamDiver diver3 = new ClamDiver("Serseia");
    diver3.dive();
    System.out.println(diver3.getName() + " collected " + diver3.getPearls() + " pearls.");

    ClamDiver diver4 = new ClamDiver("Jessica Alba");
    diver4.dive();
    System.out.println(diver4.getName() + " collected " + diver4.getPearls() + " pearls.");
  }
}