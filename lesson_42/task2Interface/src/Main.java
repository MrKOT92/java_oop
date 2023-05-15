import java.util.ArrayList;

public class Main {

  public static void main(String[] args)
  {
    Bicycle bicycle = new Bicycle();
    bicycle.goFaster();
    bicycle.goFaster();
    bicycle.goFaster();
    bicycle.stop();

    Car car = new Car();
    car.goFaster();
    car.goFaster();
    car.goFaster();
    car.stop();
  }
}