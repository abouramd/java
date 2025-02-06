import java.util.Arrays;

public class ArrayJava {
  public static void main(String[] args) {
    // array = a collection of values in the same data type

    String[] fruits = { "apple", "orange", "banana" };

    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }

    fruits[0] = "newValue";

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    Arrays.sort(fruits);

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    Arrays.fill(fruits, "FILL");

    for (String fruit : fruits) {
      System.out.println(fruit);
    }
  }
}
