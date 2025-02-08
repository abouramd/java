public class Car {
  String make = "Ford";
  String model = "Mustang";
  int year = 2025;
  double price = 58000.3;
  boolean isRunning = false;

  void start() {
    isRunning = true;
    System.out.println("You start this car.");
  }

  void stop() {
    isRunning = false;
    System.out.println("You stop this car.");
  }

  void drive() {
    System.out.println("You drive the " + model);
  }

  void brake() {
    System.out.println("You brake the " + model);
  }

}
