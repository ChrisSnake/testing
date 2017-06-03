package testing;

public class App {

  public static void main(String[] args) {
    AnotherFunc a1 = new AnotherFunc();
    System.out.println(FirstFunc.getName());

    System.out.println("Inital Version");

    System.out.println(a1.getVersion());
    System.out.println(a1.nextFunc());

  }

}
