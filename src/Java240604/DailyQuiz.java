package Java240604;

public class DailyQuiz {
  public static void main(String[] args) {
    int count = 1;

    while (count < 10000) {
      System.out.println("count = " + count);
      count++;
    }


    String result;
    for(int i = 9; i > 1; i--) {
      for(int j = 9; j > 1; j--) {
        result = String.format("%s * %s = %s", i, j, i*j);
        System.out.println(result);
      }
    }
  }
}
