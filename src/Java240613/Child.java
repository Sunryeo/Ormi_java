package Java240613;

public class Child extends Parents {

  void method2() {
    System.out.println("Child 메서드2 호출");
  }

  void method3() {
    System.out.println("Child 메서드3 호출");
  }
  void invest() {
    this.money -= 1000;
    System.out.println("천원 투자!");
  }
}
