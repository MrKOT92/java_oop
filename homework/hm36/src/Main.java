public class Main {
  public static void main(String[] args) {
    Passenger p1 = new Passenger();
    p1.setName("Cristian Pasat");
    Passenger p2 = new Passenger();
    p2.setName("Michael Jackson");
    Passenger p3 = new Passenger();
    p3.setName("Filip Kirkorov");
    Passenger p4 = new Passenger();
    p4.setName("Ala Pugaceva");
    Passenger p5 = new Passenger();
    p5.setName("Paris Hilton");
    Passenger p6 = new Passenger();
    p6.setName("Vitas");
    Passenger p7 = new Passenger();
    p7.setName("Pavel Turcu");

    Ship s = new Ship("AIT-Cohort25", 1000, 2200, "Alisher");
    s.pickPassenger(p1);
    s.pickPassenger(p2);
    s.pickPassenger(p3);
    s.pickPassenger(p4);
    s.pickPassenger(p5);
    s.pickPassenger(p6);
    s.pickPassenger(p7);

    s.printPassengers();
    s.captainGreeting();
  }
}