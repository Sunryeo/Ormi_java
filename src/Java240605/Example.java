package Java240605;

import java.util.Random;
import java.util.Scanner;

public class Example {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    int targetNum = random.nextInt(100) + 1;
    while (true) {
      System.out.println("숫자 맞추기 게임");
      System.out.print("1부터 100 사이의 숫자를 입력하세요: ");
      int input = sc.nextInt();

      if (input < targetNum) {
        System.out.println("랜덤 숫자보다 작습니다.");
      } else if (input > targetNum) {
        System.out.println("랜덤 숫자보다 큽니다.");
      } else {
        System.out.println("정답입니다!");
        break;
      }
    }

    sc.close();
  }
}
