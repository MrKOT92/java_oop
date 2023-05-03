public class Main {

  public static void main(String[] args) {

    Soda viva = new Soda("viva", "white");
    System.out.println(viva);
    System.out.println(viva.getColor());
    viva.setColor("orange");
    System.out.println(viva.getColor());

  }
}

