public class SubStrings {
  public static void main(String[] args) {
    String email = "abdelhaybouramdane@gmail.com";

    if (!email.contains("@")) {
      System.out.println("Email must contains @");
      return;
    }

    int indexOfA = email.indexOf("@");

    String username = email.substring(0, indexOfA);

    String domin = email.substring(indexOfA + 1);

    System.out.println(username);
    System.out.println(domin);
  }
}
