package Java240603;

public class Java03 {
  public static void main(String[] args) {
    int score = 95;
    String grade = (score == 95 && score % 5 == 0) ? "good" : "bad";

    if (score > 90) {
      grade = "A";
    } else {
      grade = "B";
    }
    System.out.println("당신의 학점은: " + grade);
  }
}
