package Java240531;

public class Java08 {
  public static void main(String[] args) {
    String name1 = "Tim";
    int age1 = 30;

    String name2 = "Anna";
    int age2 = 45;

    String str1 = String.format("%s의 나이는 %s세 입니다", name1, age1);
    String str2 = String.format("%s의 나이는 %s세 입니다", name2, age2);
    System.out.println(str1);
    System.out.println(str2);
  }
}
