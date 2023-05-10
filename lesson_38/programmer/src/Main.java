import java.util.List;

public class Main {

  public static void main(String[] args) {
    Programmer p1= new Programmer("Jack", 5000);
    Programmer p2= new Programmer("John", 3000);
    QAEngineer q1= new QAEngineer("Vadim", 4000);
    QAEngineer q2= new QAEngineer("Kolin", 7000);

    Manager manager = new Manager("Cristian", 4000, 2000);

    List<Employee> employees = List.of(p1,p2,q1,q2,manager);
    for(Employee employee: employees){
      employee.paySalary();
      employee.work();
    }
  }

}
