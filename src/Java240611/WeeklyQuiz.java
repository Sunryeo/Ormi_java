package Java240611;

import java.util.Scanner;

public class WeeklyQuiz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int operator;

    while (true) {
      System.out.println("원하는 기능을 선택하세요\n1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 / 0. 종료");
      operator = sc.nextInt();
      sc.nextLine();

      if (operator > 4) {
        System.out.println("올바른 입력이 아닙니다.");
        continue;
      } else if (operator == 0) {
        break;
      }

      System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
      int num1 = sc.nextInt();
      sc.nextLine();

      System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
      int num2 = sc.nextInt();
      sc.nextLine();

      switch (operator) {
        case 1 -> System.out.println(String.format("%s + %s = %s", num1, num2, num1 + num2));
        case 2 -> System.out.println(String.format("%s - %s = %s", num1, num2, num1 - num2));
        case 3 -> System.out.println(String.format("%s * %s = %s", num1, num2, num1 * num2));
        case 4 -> System.out.println(String.format("%s / %s = %s", num1, num2, num1 / num2));
      }
    }
  }
}
