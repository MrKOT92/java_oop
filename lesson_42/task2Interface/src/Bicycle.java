public class Bicycle implements Driveable {
  private int speed;

  @Override
  public void goFaster() {
    speed +=5;
    System.out.println(" bicycle accelerating, current speed: " + speed);
  }

  @Override
  public void stop() {
   speed =0;
    System.out.println(" bicycle stopped");
  }
}
