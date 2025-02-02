public class StringMethod {
  public static void main(String[] args) {
    String name = "       Bro Code          ";

    int length = name.length();

    char letter = name.charAt(0);

    int index = name.indexOf("o");

    int lastIndex = name.lastIndexOf("o");

    name = name.toUpperCase();

    name = name.toLowerCase();

    name = name.trim();

    name = name.replace("o", "a");

    boolean isEmpty = name.isEmpty();

    boolean containsSpace = name.contains(" ");

    boolean isTheSame = name.equals("pass");

    boolean isTheSameIgnoreCase = name.equalsIgnoreCase("pass");
  }
}
