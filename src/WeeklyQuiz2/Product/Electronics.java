package WeeklyQuiz2.Product;

import WeeklyQuiz2.Brand;
import WeeklyQuiz2.Product.Product;

public class Electronics extends Product {
  private Brand brand;

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public Electronics(String name, double price, int stock, Brand brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  @Override
  public double calculatePrice(int amount) {
    this.handlingStock(amount);
    return this.brand == Brand.Apple ? this.getPrice() * 1.2 * amount : this.getPrice();
  }
}
