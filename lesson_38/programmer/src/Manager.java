public class Manager extends Employee {

  private int bonus;

  public Manager(String name, int salary , int bonus) {
    super(name,salary);
    this.bonus= bonus;
  }

  @Override
  public String toString() {
    return "Manager{" +
        "name='" + getName() + '\'' +
        ", salary=" + getSalary() +
        ", bonus=" + bonus +
        '}';
  }

  public void work(){
    System.out.println( getName() + "I'm a manager, I lead ");
  }
  public void paySalary(){
    System.out.println(getName()+  ": I get my salary " + getSalary() + " bonus " + bonus);
  }
}
