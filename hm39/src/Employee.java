abstract class Employee {

  protected double baseSalary;
  protected int experience;

  public Employee(double baseSalary, int experience) {
    this.baseSalary = baseSalary;
    this.experience = experience;
  }
  public abstract double calculateSalary();
}
