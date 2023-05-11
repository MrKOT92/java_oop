class ITengineer extends Employee {
  public ITengineer(double baseSalary, int experience) {
    super(baseSalary, experience);
  }

  @Override
  public double calculateSalary() {
    double itSalaryPercentage = experience * 0.05;
    return baseSalary + (baseSalary * itSalaryPercentage);
  }
}