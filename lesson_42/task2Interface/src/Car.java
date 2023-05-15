public class Car implements Driveable{
private  int speed;

  @Override
  public void goFaster() {
    speed += 20;
    System.out.println("car accelerating, current speed " +speed);
  }

  @Override
  public void stop() {
    speed=0;
    System.out.println("car has stopped");
  }
}
