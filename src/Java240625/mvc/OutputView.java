package Java240625.mvc;

public class OutputView {
  public static void printProfile(Student student) {
    System.out.println("내 이름은 " + student.getName() + "입니다.");
    System.out.println("저는 " + student.getAge() + "세 " + "입니다.");
  }

  // 잘못된 예시
  public void printProfile2() {
    Student student = new Student("홍길동", 25);
    System.out.println("내 이름은 " + student.getName() + "입니다.");
    System.out.println("저는 " + student.getAge() + "세 " + "입니다.");
  }
}
