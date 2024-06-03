package Java240531;

public class Java12 {
  public static void main(String[] args) {
    boolean isRaining = true;

    if (isRaining) {
      System.out.println("하늘에서 비가와요");
    }
    if (!isRaining) {
      System.out.println("비가 안와요");
    }

    boolean isSunny = false;

    if (!isSunny) {
      System.out.println("날씨가 맑아요");
    } else {
      System.out.println("집에서 쉬어요");
    }
  }
}
