package Java240603;

public class Java04 {
  public static void main(String[] args) {
    String day = "수";

    switch (day) {
      case "월":
        System.out.println("월요일에는 책 읽기");
        break;
      case "화":
        System.out.println("화요일에는 밥 먹기");
        break;
      case "수":
        System.out.println("수요일에는 놀기");
        break;
      case "목":
        System.out.println("목요일에는 공부하기");
        break;
      case "금":
        System.out.println("금요일에는 게임하기");
        break;
      default:
        System.out.println("알 수 없는 요일");
    }

    //    "Excellent", "Good", "Average", "Below Average", "Fail"
    char grade = 'A';

    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fail");
        break;
      default:
        System.out.println("not exist");
    }

    char operator = '+';
    int num1 = 1;
    int num2 = 5;

    switch (operator) {
      case '+':
        System.out.println("result: " + (num1 + num2));
        break;
      case '-':
        System.out.println("result: " + (num1 - num2));
        break;
      case '*':
        System.out.println("result: " + (num1 * num2));
        break;
      case '/':
        System.out.println("result: " + (num1 / num2));
        break;
    }

    int score = 80;

    switch (score / 10){
      case 10,9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
    }
  }
}
