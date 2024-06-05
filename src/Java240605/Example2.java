package Java240605;

import java.util.Scanner;

public class Example2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("영화 제목을 입력하세요: ");
    String title = sc.nextLine();

    System.out.print("관람 인원 수를 입력하세요: ");
    int ticketCnt = sc.nextInt();
    sc.nextLine();

    System.out.print("예매자의 이름을 입력하세요: ");
    String reservationName = sc.nextLine();

    System.out.print("예매자의 전화번호를 입력하세요: ");
    String reservationPhone = sc.nextLine();

    // 출력
    System.out.println("==== 영화 티켓 예매 정보 ====");
    System.out.println(String.format("영화제목: [%s]", title));
    System.out.println(String.format("관람인원: [%s]", ticketCnt));
    System.out.println(String.format("예매자 이름: [%s]", reservationName));
    System.out.println(String.format("예매자 전화번호: [%s]", reservationPhone));
  }
}
