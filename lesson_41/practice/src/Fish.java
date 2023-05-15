import java.util.Random;

public class Fish {
  private String type;
  private double weight;
  private int length;

  public Fish(String type) {
    this.type = type;
    this.length = generateRandomLength();
    this.weight = calculateWeight();
  }

  private int generateRandomLength() {
    int minLength = 7;
    int maxLength = 60;
    Random random = new Random();
    return random.nextInt(maxLength - minLength + 1) + minLength;
  }

  private double calculateWeight() {
    return length * 40;
  }


  public String getType() {
    return type;
  }

  public int getLength() {
    return length;
  }
  public double getWeight() {
    return weight;
  }
}