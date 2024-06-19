package WeeklyQuiz2.Product;

import WeeklyQuiz2.Product.Product;
import WeeklyQuiz2.Size;

public class Clothing extends Product {

  private Size size;

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  public Clothing(String name, double price, int stock, Size size) {
    super(name, price, stock);
    this.size = size;
  }

  @Override
  public double calculatePrice(int amount) {
    this.handlingStock(amount);
    if (this.size == Size.S || this.size == Size.M) {
      return super.calculatePrice(amount);
    } else return this.getPrice() * 1.1 * amount;
  }
}
