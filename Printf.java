public class Printf {
  public static void main(String[] args) {
    String name = "Spongebob";
    char firstLitter = 'S';
    int age = 30;
    double height = 60.5;
    boolean isEmployed = true;

    // %[flags][width][.precision]conversion.

    System.out.printf("Hello %s\n", name);
    System.out.printf("Your name starts with a %c\n", firstLitter);
    System.out.printf("You are %04d years old\n", age);
    System.out.printf("You are %.2f cm tall\n", height);
    System.out.printf("Employed: %b\n", isEmployed);

    System.out.printf("%s is %d years old.\n", name, age);
  }
}
