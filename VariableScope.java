public class VariableScope {

  static int var = 3; // class variable

  public static void main(String[] args) {
    int var = 1; // local variable

    System.out.println(var);
  }

  static void doSomthing() {
    int var = 2; // local variable
    
    System.out.println(var);
  }

  static void doSomthingTwo() {
    System.out.println(var);
  }
}
