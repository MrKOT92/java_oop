abstract class Employee {

  public double baseSalary;
  public int experience;

  public Employee(double baseSalary, int experience) {
    this.baseSalary = baseSalary;
    this.experience = experience;
  }
  public abstract double calculateSalary();
  public double calculateSalary(double additionalBonus) {
    double increasePercentage = (experience * 0.05) + (additionalBonus / baseSalary);
    return baseSalary + (baseSalary * increasePercentage);
  }
}

