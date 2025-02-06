public class SearchInArray {
  public static void main(String[] args) {
    int[] number = { 1, 6, 4, 3, 9, 2 };
    int target = 2;
    boolean isFound = false;

    for (int i = 0; i < number.length; i++) {
      if (target == number[i]) {
        System.out.println("Element Found at index: " + i);
        isFound = true;
        break;
      }
    }

    if (!isFound) {
      System.out.println("Element not found in the array");
    }
  }
}
