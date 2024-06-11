package Java240611;

public class Person {
  String name;
  String phoneNumber;
  int money;
  int age;

  // 생성자
  public Person(String name, String phoneNumber, int money, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.money = money;
    this.age = age;
  }

  public void sayMoney() {
    System.out.println("I have " + money * 10000 + "won");
  }

  public void teaching(Student student) {
    student.levelUp();
  }

  public void cheating(Student student) {
    student.levelDown();
  }
}
