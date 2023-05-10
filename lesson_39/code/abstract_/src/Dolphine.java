public class Dolphine  extends Animal{
  double speedinWater;

  public Dolphine(String name, double weight, double speedinWater) {
    super(name, weight);
    this.speedinWater = speedinWater;
  }
  @Override
  public void move (){
    System.out.println("Swim with speed" + speedinWater);
  }
}
