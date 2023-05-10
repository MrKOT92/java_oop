public class Main {

  public static void main(String[] args) {
  DrivingSchool BehnySchool = new DrivingSchool("Behny School");
  Person bob = new Person("Bobk", null);
  Person john = new Person("Johny", null);
    System.out.println(bob);
    BehnySchool.teach(bob);
    System.out.println(bob);
    BehnySchool.teach(john, "B");
    System.out.println(john);
  }
}