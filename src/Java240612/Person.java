package Java240612;

import Java240612.car.Car;

public class Person {

  private String name2;
  String name;
  int age;
  //  final String gender;
  int gold = 999999999;
  static final double PI = 3.14159;
  static final boolean ISALIVE = true;

//  Car car = new Car();
//  String str = car.test;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    //    this.gender = gender;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old");
  }

  private String checkAmount(int amount) {
    if (amount > this.gold) {
      return "요청하신 금액이 너무 큽니다.";
    }
    return "정상처리되었습니다.";
  }

  public String deposit(int amount) {
    return checkAmount(amount);
  }

  public static void say() {
    System.out.println("good");
  }

  protected void testMethod() {
    System.out.println("test");
  }
}
