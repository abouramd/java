public class JavaOOP {
  public static void main(String[] args) {
    Car car = new Car();

    System.out.println(car.make);

    car.make = "abdelhay";

    System.out.println(car.make);

    car.start();

    car.stop();

    Student student = new Student("abdelhay", 22);

    System.out.println(student.name + " " + student.age);
  }
}
