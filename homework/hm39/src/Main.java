public class Main {
  public static void main(String[] args) {
    ITengineer itEngineer = new ITengineer(6000, 3);
    double additionalBonus = 1000;
    System.out.println("IT Engineer Salary: " + itEngineer.calculateSalary(additionalBonus));

    QAengineer qaEngineer = new QAengineer(5000, 5);
    System.out.println("QA Engineer Salary: " + qaEngineer.calculateSalary());

  }
}