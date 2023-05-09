public class Calculator {

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int difference(int x, int y) {
    return x - y;
  }

  public static int product(int x, int y) {
    return x * y;
  }

  public static double quotient(int x, int y) {
    if (y == 0) {
      throw new IllegalArgumentException("Cannot divide by zero");
    }
    return (double) x / y;
  }


}


