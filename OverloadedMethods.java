public class OverloadedMethods {
  public static void main(String[] args) {

  }

  static double add(double a, double b) {
    return a + b;
  }

  static double add(double a, double b, double c) {
    return a + b + c;
  }

  // methods share the same name but different parameters
  //
  // signature = name + parameters
}
