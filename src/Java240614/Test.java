package Java240614;

import java.util.Scanner;

public class Test {

  private static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }

  public static void main(String[] args) {

    Division div = new Division();

    try {
      div.divide(10, 1);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } catch (CannotDivideException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("이건 예외여부와 상관없이 항상 실행됩니다.");
    }

    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.print("첫번째 수를 입력하시오: ");
    //    int firstNum = sc.nextInt();
    //    sc.nextLine();
    //
    //    System.out.print("두번째 수를 입력하시오: ");
    //    int secondNum = sc.nextInt();
    //    sc.nextLine();
    //
    //    try {
    //      int result = divide(firstNum, secondNum);
    //      System.out.println("result: " + result);
    //    } catch (ArithmeticException e) {
    //      System.out.println(e.getMessage());
    //    } finally {
    //      sc.close();
    //    }
    //
    //    System.out.println("원하는 배열의 크기를 입력하세요: ");
    //    int length = sc.nextInt();
    //    int[] arr = new int[length];
    //
    //    for (int i = 0; i < arr.length; i++) {
    //      arr[i] = i;
    //    }
    //
    //    System.out.println("원하는 배열의 인덱스를 입력하세요: ");
    //    int idx = sc.nextInt();
    //
    //    try {
    //      System.out.println("result: " + arr[idx]);
    //    } catch (ArrayIndexOutOfBoundsException e) {
    //      System.out.println("인덱스를 벗어났습니다.");
    //    } finally {
    //      sc.close();
    //    }
    //
    //    Zookeeper zookeeper = new Zookeeper();
    //    Rabbit rabbit = new Rabbit();
    //    Deer deer = new Deer();
    //    zookeeper.feed2(rabbit);
    //    zookeeper.feed2(deer);
  }
}
