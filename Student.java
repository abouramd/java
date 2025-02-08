public class Student {
  String name;
  int age;
  boolean isEnrolled;

  Student(String name, int age) {
    System.out.println("constractor");
    this.name = name;
    this.age = age;
    this.isEnrolled = false;
  }
}
