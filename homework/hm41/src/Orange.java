public class Orange {
int diameter ;

  Orange(){
    diameter =  7+ (int)(Math.random()*9);
  }

  @Override
  public String  toString() {
    return "Orange{" +
        "diameter=" + diameter +
        '}';
  }
}
