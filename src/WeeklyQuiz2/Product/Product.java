package WeeklyQuiz2.Product;

public abstract class Product {
  private String name;
  private double price;
  private int stock;

  public Product(String name, double price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
    } else throw new RuntimeException("가격은 음수가 될 수 없습니다.");
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    if (stock >= 0) {
      this.stock = stock;
    } else throw new RuntimeException("재고는 음수가 될 수 없습니다.");
  }

  public double calculatePrice(int amount) {
    return this.price * amount;
  }

  void handlingStock(int amount) {
    if(amount <= stock) {
      stock -= amount;
    } else throw new RuntimeException("구매수량이 재고를 초과하였습니다.");
  }
}
