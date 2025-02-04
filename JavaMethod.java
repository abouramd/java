public class JavaMethod {
  public static void main(String[] args) {
    happyBirthday("abdelhay");
  }

  static void happyBirthday(String name) {
    System.out.println("Happy Birthday to you!");
    System.out.printf("Happy Birthday dear %s!\n", name);
    System.out.println("Happy Birthday to you!");
  }
}
