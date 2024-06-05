package Java240605;

import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //    System.out.print("입력하세요: ");
    //    String str = sc.nextLine();
    //    System.out.println("입력받은 값: " + str);
    //
    //    sc.close(); // scanner 연결 끊기

    System.out.println("계절을 맞춰보세요!");
    sc.nextLine();
    System.out.print("1 ~ 4 사이의 정수를 입력하세요: ");
    int input = sc.nextInt();

    switch (input) {
      case 1:
        System.out.println("봄입니다.");
        break;
      case 2:
        System.out.println("여름입니다.");
        break;
      case 3:
        System.out.println("가을입니다.");
        break;
      case 4:
        System.out.println("겨울입니다.");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
    }
  }
}
