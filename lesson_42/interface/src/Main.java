import java.util.ArrayList;

public class Main {

  public static void main(String[] args)
  {
    Duck duck = new Duck();
    duck.swim();
    Fish fish = new Fish();
    fish.swim();
    ArrayList<Swimmable> swimmables = new ArrayList<>();
    swimmables.add(fish);
    swimmables.add(duck);
  }
}