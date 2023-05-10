import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int x = 100;
    int y = 10;

    int sum = Calculator.sum(x, y);
    int difference = Calculator.difference(x, y);
    int product = Calculator.product(x, y);
    double quotient = Calculator.quotient(x, y);

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);




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



int totalCars = Car.getTotalNumberOfCars();
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


    List<Car> carList = new ArrayList<>();
    carList.add(car1);
    carList.add(car2);
    carList.add(car3);
    carList.add(car4);
    carList.add(car5);
    carList.add(car6);
    carList.add(car7);
    carList.add(car8);
    carList.add(car9);
    carList.add(car10);

    for (Car car : carList) {
      System.out.println(car.getBrand() + " - $" + car.getPrice() + " - " + car.getYear());
    }

  }

  }


