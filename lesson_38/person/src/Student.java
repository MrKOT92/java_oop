public class Student  extends Person{
  public String kurs;

  @Override
  public void introduce(){
    System.out.println("Hello my name is " +getName() + " I'am a stunde. I study " + kurs);
  }
  public Student(String name, String kurs) {
    super(name);
    this.kurs = kurs;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + getName() + '\'' +
        ", kurs='" + kurs + '\'' +
        '}';
  }
}
