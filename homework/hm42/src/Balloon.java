public class Balloon implements FlyableVehicle {

  double height;
  double distance;


  @Override
  public void takeOff() {
    this.height = 1500;
  }

  @Override
  public void land() {
    this.height = 0;
  }

  @Override
  public void fly(double distance) {
    this.distance += distance;
  }
}

