import java.util.ArrayList;
import java.util.List;

public class Transport {
private String title;
private int capacity;
  List<Passenger> passengers = new ArrayList<>();
  private int speed;

  public Transport(String title, int capacity, int speed) {
    this.title = title;
    this.capacity = capacity;
    this.speed = speed;
    passengers = new ArrayList<>();
  }

  // print passengers
  public void printPassengers() {
    System.out.println("Passengers on  the board:");
    for (Passenger passenger : passengers) {
      System.out.println(passenger.getName());
    }
  }
// pick up or cannot pick up passenger
  public void pickPassenger(Passenger passenger) {
    if (passengers.size() < capacity) {
      passengers.add(passenger);
      System.out.println("Passenger " + passenger.getName() + " picked up. Welcome!");
    } else {
      System.out.println("The vehicle is full. Cannot pick up " + passenger.getName() + "Sorry, come on with the next plane.");
    }
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}

