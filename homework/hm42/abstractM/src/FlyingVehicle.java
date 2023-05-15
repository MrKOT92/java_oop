abstract class FlyingVehicle {
  double height;
   double distance;

  public void takeOff() {
    height = getTakeOffHeight();
  }

  public void land() {
    height = 0;
  }

  public void fly(double distance) {
    this.distance += distance;
  }

  protected abstract double getTakeOffHeight();
}
