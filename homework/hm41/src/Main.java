public class Main {
  public static void main(String[] args) {
//    Orange orange1 = new Orange();
//    Orange orange2 = new Orange();
//    System.out.println(orange1);
//    System.out.println(orange2);
    OrangeTree tree1 = new OrangeTree();
    System.out.println(tree1);
    for (int i = 1; i < 120; i++){
      tree1.passGrowingSeason();
      System.out.println(tree1);
      System.out.print("Год "+ i + " " + "isDead = " + tree1.isDead()+ " ");
    }
  }
}