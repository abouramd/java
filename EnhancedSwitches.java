import java.util.Scanner;

public class EnhancedSwitches {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the day of the week: ");
    String day = scanner.nextLine();

    // normal swith
    // switch (key) {
    // case value:
    //
    // break;
    //
    // default:
    // break;
    // }

    switch (day) {
      case "Monday" -> System.out.println("It is a weekday.");
      case "Tuesday" -> System.out.println("It is a weekday.");
      case "Wednesday" -> System.out.println("It is a weekday.");
      case "Thursday" -> System.out.println("It is a weekday.");
      case "Saturday", "Sunday" -> System.out.println("It is a weekend.");
      default -> System.out.println(day + " is not a day");
    }

    scanner.close();
  }
}
