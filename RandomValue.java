import java.util.Random;

public class RandomValue {
  public static void main(String[] args) {
    Random random = new Random();

    int num = random.nextInt();

    System.out.println(num);

    num = random.nextInt(1, 6);

    System.out.println(num);

    double number = random.nextDouble();

    System.out.println(number);

    boolean choice = random.nextBoolean();

    System.out.println(choice);
  }
}
