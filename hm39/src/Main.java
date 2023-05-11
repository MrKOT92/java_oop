public class Main {

  public static void main(String[] args) {
    ITengineer itEngineer = new ITengineer(6500, 3);
    System.out.println("IT Engineer Salary: " + itEngineer.calculateSalary());

    QAengineer qaEngineer = new QAengineer(5500, 5);
    System.out.println("QA Engineer Salary: " + qaEngineer.calculateSalary());
  }
}