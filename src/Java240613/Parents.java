package Java240613;

public class Parents {
  int money = 10000;

  void save() {
    money += 10000;
    System.out.println("만원 저축!");
  }

  public void say() {
    System.out.println("hello");
  }

  void method1() {
    System.out.println("Parent 메서드1 호출");
  }

  void method2() {
    System.out.println("Parent 메서드2 호출");
  }
}
