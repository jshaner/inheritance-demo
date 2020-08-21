public class Subclass extends Superclass {

  @Override
  public void doSomething() {
    System.out.println("Subclass.doSomething");
  }

  public static void doSomethingElse() {
    System.out.println("Superclass.doSomethingElse");
  }
}
