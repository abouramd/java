import java.util.Scanner;

public class InputToArray {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("What # of food do you want?: ");

    int size = scanner.nextInt();

    scanner.nextLine();

    String[] foods = new String[size];

    for (int i = 0; i < foods.length; i++) {
      System.out.print("Enter a food: ");
      foods[i] = scanner.nextLine();
    }

    for (String food : foods) {
      System.out.println(food);
    }

    scanner.close();
  }
}
