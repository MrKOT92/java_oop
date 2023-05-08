public class Calculator {
private int sum;
private int difference;

  public Calculator(int sum, int difference) {
    this.sum = sum;
    this.difference = difference;
  }

  @Override
  public String toString() {
    return "Calculator{" +
        "sum=" + sum +
        ", difference=" + difference +
        '}';
  }
}

