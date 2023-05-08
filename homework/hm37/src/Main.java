import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Calculator hp = new Calculator(55, 45);
    System.out.println(hp);
    System.out.println("The cars what we have: ");

    Car car1 = new Car("Audi", 2020);
    Car car2 = new Car("Mercedes", 2021);
    Car car3 = new Car("BMW", 2020);
    Car car4 = new Car("Skoda", 2022);
    Car car5 = new Car("Volvo", 2015);
    Car car6 = new Car("Opel", 2022);
    Car car7 = new Car("Renault", 2023);
    Car car8 = new Car("Ferrari", 2018);
    Car car9 = new Car("Bugatti", 2020);
    Car car10 = new Car("Lada", 2023);


    System.out.println("Total produced cars: " + Car.getTotalNumberOfCars());
    System.out.println("Price of each car: $" + Car.getPrice());
    car1.increasePrice(650.0);
    car2.decreasePrice(950.0);
    car3.increasePrice(10000.0);
    car4.decreasePrice(950.0);
    car5.increasePrice(3000.0);
    car6.decreasePrice(1950.0);
    car7.increasePrice(650.0);
    car8.decreasePrice(750.0);
    car9.decreasePrice(2250.0);

    System.out.println("New price of each car: $" + Car.getPrice());

  }


}