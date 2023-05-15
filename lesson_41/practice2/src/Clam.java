import java.util.Random;

public class Clam {
  private int numberOfPearls;

  public Clam(){
    this.numberOfPearls = generateRandomNumberOfPearls();
  }

  private int generateRandomNumberOfPearls() {
    Random random = new Random();
    return random.nextInt(5);
  }

  public int getNumberOfPearls() {
    return numberOfPearls;
  }
}