public class Main {

  public static void main(String[] args) {
    Superclass s1 = new Superclass();
    Superclass s2 = new Subclass();
    Subclass s3 = new Subclass();
    s1.doSomething();
    s2.doSomething();
    s3.doSomething();
    s1.doSomethingElse();
    s2.doSomethingElse();
    s3.doSomethingElse();
  }

}
