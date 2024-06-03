package Java240603;

public class Java05 {
  public static void main(String[] args) {
    // if문
    int age = 10;
    String status;
    if (age >= 18) {
      status = "성인";
    } else {
      status = "미성년자";
    }
    System.out.println("age = " + age + "status = " + status);

    // 삼항연산자
    status = (age >= 18) ? "성인" : "미성년자";
    System.out.println("age = " + age + "status = " + status);
  }
}
