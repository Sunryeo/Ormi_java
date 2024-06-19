package WeeklyQuiz2.Product;

import WeeklyQuiz2.Product.Product;

import java.time.LocalDate;
import java.time.Period;

public class Food extends Product {

  private String expirationDate;

  public Food(String name, double price, int stock, String expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
  }

  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  private int calculateDate() {
    LocalDate now = LocalDate.now();
    String[] expirationDateArr = expirationDate.split("-");
    int year = Integer.parseInt(expirationDateArr[0]);
    int month = Integer.parseInt(expirationDateArr[1]);
    int day = Integer.parseInt(expirationDateArr[2]);

    LocalDate parsedExpirationDate = LocalDate.of(year, month, day);
    Period diff = Period.between(parsedExpirationDate, now);

    return Math.abs(diff.getDays());
  }

  @Override
  public double calculatePrice(int amount) {
    this.handlingStock(amount);
    int dateDiff = calculateDate();
    return dateDiff <= 7 ? this.getPrice() * 0.8 * amount : this.getPrice();
  }
}
