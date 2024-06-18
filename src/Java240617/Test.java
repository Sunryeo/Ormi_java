package Java240617;

public class Test {
  public static void main(String[] args) {
    //        InterfaceC impleC = new ImpleC();
    //
    //        InterfaceA interfaceA = impleC;
    //        interfaceA.methodA();
    //
    //        InterfaceB interfaceB = impleC;
    //        interfaceB.methodB();
    //
    //        impleC.methodA();
    //        impleC.methodB();
    //        impleC.methodC();

    Car kiaCar = new KiaCar();
    System.out.println(kiaCar.getTire());
    System.out.println(kiaCar.showEngine());
    System.out.println(kiaCar.amountNavi());
  }
}
