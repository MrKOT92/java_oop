import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class OrangeTree {
 private double height;
 private int age;
  LinkedList<Orange> oranges ;

  public OrangeTree(double height, int age) {
    this.height = height;
    this.age = age;
    this.oranges = new LinkedList<Orange>();
  }

  public OrangeTree() {
   this.oranges = new LinkedList<Orange>();
  }
public void passGrowingSeason(){

    oranges.clear();
     age++;
     if (height<25) {
       height += 2.5;
     }
     // generate oranges
  //
  if(isMature()  && !isDead()){
    int numberOfOranges = new Random().nextInt(100, 301);
    for (int i = 0; i < numberOfOranges; i++){
      oranges.add(new Orange());
    }
  }
}
public boolean isMature(){
    return  age>=6;
}


public boolean isDead(){
    return  age >= 100;
}

 public boolean hasOranges(){
  // return !oranges.isEmpty();
    return oranges.size() > 0;
 }

 public Orange pickOrange (){
    if (hasOranges()){
      Orange orange = oranges.get(oranges.size()-1);
      oranges.remove(oranges.size()-1);
      return orange;
    }
    return null;
 }

 public double getAverageSizeOfOrange(){

    double sum = 0 ;
    for(Orange orange: oranges){
      sum += orange.diameter;
    }
   return sum / oranges.size();
 }
  @Override
  public String toString() {
    return "OrangeTree{" +
        "height=" + height +
        ", age=" + age +
        " total oranges: " + oranges.size()+
        " average size: " + getAverageSizeOfOrange()+
        ", oranges=" + oranges +
        '}';
  }
}
