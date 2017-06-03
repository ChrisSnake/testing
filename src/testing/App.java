package testing;

public class App {

  public static void main(String[] args) {
    AnotherFunc a1 = new AnotherFunc();
    System.out.println(FirstFunc.getName());

    System.out.println("Inital Version");

    System.out.println(a1.getVersion());
    System.out.println(a1.nextFunc());

    // basicMath
    int a = 5, b = 3;
    System.out.println("5+3=" + MyMath.add(a, b));

    System.out.println("5*3=" + MyMath.mul(a, b));
    System.out.println("5/3=" + MyMath.div(a, b));

    System.out.println("für pull-request");

    System.out.println("nochmal pull-request, jetzt für commandline");

  }

}
