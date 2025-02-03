import java.util.Scanner;

public class WeightConvert {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double weight;
    double newWeight;
    int choice;

    System.out.println("Weight Convert Program");
    System.out.println("1 - Convert lbs to kgs");
    System.out.println("2 - Convert kgs to lbs");

    System.out.print("Choose an option: ");
    choice = scanner.nextInt();

    if (choice == 1) {
      System.out.print("Enter the weight in lbs: ");
      weight = scanner.nextDouble();
      newWeight = weight * 0.453592;
      System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
    } else if (choice == 2) {
      System.out.print("Enter the weight in kgs: ");
      weight = scanner.nextDouble();
      newWeight = weight * 2.2046;
      System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
    } else {
      System.err.println("Invalid option.");
    }

    scanner.close();

  }
}
