class QAengineer extends Employee {
  public QAengineer(double baseSalary, int experience) {
    super(baseSalary, experience);
  }

  @Override
  public double calculateSalary() {
    double qaSalaryPercentage = experience * 0.05;
    return baseSalary + (baseSalary * qaSalaryPercentage);
  }
}