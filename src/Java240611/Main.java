package Java240611;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Sunryeo sunryeo = new Sunryeo();
    sunryeo.introduce();

    Subject german = new Subject("german", 3);
    Subject english = new Subject("english", 4);
    Subject computerScience = new Subject("computerScience", 2);

    sunryeo.study(english);
    sunryeo.study(computerScience);
    sunryeo.studyAbroad(german);

    sunryeo.work();

    Friend dowool = new Friend("dowool", 318, "남자", 2);
    Friend bao = new Friend("bao", 320, "남자", 2);
    Friend jinnie = new Friend("jinnie", 312, "여자", 1);
    Friend mallang = new Friend("mallang", 312, "여자", 1);

    Friend[] friendsArr1 = {dowool, bao, jinnie, mallang};
    sunryeo.socializingWith(friendsArr1);

    sunryeo.work();

    Friend[] friendsArr2 = {bao, jinnie};
    sunryeo.conflictWith(friendsArr2);
  }
  //    Scanner scanner = new Scanner(System.in);
  //
  //    // 계좌 생성
  //    System.out.print("계좌번호를 입력하세요: ");
  //    String accountNumber = scanner.nextLine();
  //    System.out.print("소유자 이름을 입력하세요: ");
  //    String ownerName = scanner.nextLine();
  //    BankAccount account = new BankAccount(accountNumber, ownerName);
  //
  //    // 입금 및 출금
  //    account.deposit(100000);
  //    account.withdraw(50000);
  //
  //    // 잔액조회
  //    account.printBalance();
  //
  //    scanner.close();
}
