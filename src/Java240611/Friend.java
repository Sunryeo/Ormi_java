package Java240611;

public class Friend {
  String name;
  int age;
  String gender;
  int intimacy;

  public Friend(String name, int age, String gender, int intimacy) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.intimacy = intimacy;
  }

  public void intimacyUp() {
    intimacy++;
    System.out.println(String.format("%s와(과)의 친밀도가 1 상승하였습니다.", name));
  }

  public void intimacyDown() {
    if (intimacy > 0) {
      intimacy--;
    }
    System.out.println(String.format("%s와(과)의 친밀도가 1 하락하였습니다.", name));
  }
}
