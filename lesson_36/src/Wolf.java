public class Wolf extends Animal {
  boolean isAggressive;

  public Wolf(String name, int age, boolean isAgressive) {
    super(name, age);
    this.isAggressive = isAgressive;
  }

  @Override
  public String toString() {
    return "Wolf{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", isAgressive=" + isAggressive +
        '}';
  }
}