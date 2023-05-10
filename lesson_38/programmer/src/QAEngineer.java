public class QAEngineer  extends Employee {

  public QAEngineer(String name, int salary) {
    super(name, salary);
  }

  @Override

  public String toString() {
    return "QAEngineer{" +
        "name='" + getName() + '\'' +
        ", salary=" + getSalary() +
        '}';
  }

  public void work() {
    System.out.println(getName() + "I'm a QAEngineer, I check the  code ");
  }
}