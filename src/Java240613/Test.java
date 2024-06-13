package Java240613;

public class Test {
  public static void main(String[] args) {
    //        InheritB inheritB = new InheritB();
    //
    //        inheritB.field2 = "필드2";
    //        inheritB.method2();
    //
    //        inheritB.field1 = 100;
    //        inheritB.method1();

    //    Child child = new Child();
    //    child.method1();
    //    child.method2();
    //    child.method3();

    int r = 10;

    Calculator cal = new Calculator();
    System.out.println("원면적" + cal.areaCircle(r));
    System.out.println();

    Computer com = new Computer();
    System.out.println("원면적" + com.areaCircle(r));
  }
}
