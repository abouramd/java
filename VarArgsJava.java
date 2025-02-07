public class VarArgsJava {
  public static void main(String[] args) {
    int res = add(1, 4, 5, 6, 7);

    System.out.println(res);
  }

  static int add(int... numbers) {
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }

    return sum;
  }

  static double average(double... numbers) {
    double sum = 0;

    if (numbers.length == 0)
      return 0;

    for (double number : numbers) {
      sum += number;
    }

    return sum / numbers.length;
  }
}
