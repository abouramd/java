public class MathClass {
  public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.E);

    double result;

    result = Math.pow(2, 3);

    System.out.println("POW: " + result);

    result = Math.abs(-10);

    System.out.println("abs: " + result);

    result = Math.sqrt(9);

    System.out.println("sqrt: " + result);

    result = Math.round(3.14);

    System.out.println("round: " + result);

    result = Math.ceil(3.14);

    System.out.println("ceil: " + result);

    result = Math.floor(3.14);

    System.out.println("floor: " + result);

    result = Math.max(3.14, 10);

    System.out.println("max: " + result);

    result = Math.min(3.14, 20);

    System.out.println("min: " + result);

  }
}
