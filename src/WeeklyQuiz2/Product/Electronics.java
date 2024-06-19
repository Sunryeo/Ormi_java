package WeeklyQuiz2.Product;

import WeeklyQuiz2.Product.Product;

public class Electronics extends Product {
  private String brand;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Electronics(String name, double price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  @Override
  public double calculatePrice(int amount) {
    this.handlingStock(amount);
    return this.brand == "Apple" ? this.getPrice() * 1.2 * amount : this.getPrice();
  }
}
