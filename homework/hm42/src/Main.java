public class Main {
  public static void main(String[] args) {
    Balloon balloon = new Balloon();
    balloon.takeOff();
    System.out.println("Balloon height: " + balloon.height);
    balloon.fly(200);
    System.out.println("Balloon distance traveled: " + balloon.distance);
    balloon.land();
    System.out.println("Balloon altitude after landing: " + balloon.height);

    Plane plane = new Plane();
    plane.takeOff();
    System.out.println("Plane height: " + plane.height);  //
    plane.fly(900);
    System.out.println("Planes distance traveled: " + plane.distance);
    plane.land();
    System.out.println("Plane altitude after landing: " + plane.height);
  }
}
