public class Main {

  public static void main(String[] args)
  {
    Person p = new Person("jack", 24);
    Person p1 = new Person("John", 45);
    System.out.println(p);
    System.out.println(p1);

     Object obj = new Object();
     Object obj2 = p1;
     Person p3 = (Person)obj2;

     String str = (String)obj2;

     System.out.println(obj2);
  }
}