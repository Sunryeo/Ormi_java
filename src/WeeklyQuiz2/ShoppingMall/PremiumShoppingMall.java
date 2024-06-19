package WeeklyQuiz2.ShoppingMall;

import WeeklyQuiz2.Product.Product;
import WeeklyQuiz2.ShoppingMall.ShoppingMall;

public class PremiumShoppingMall<T extends Product> extends ShoppingMall {

  public PremiumShoppingMall(int capacity) {
    super(capacity);
  }

  @Override
  public boolean checkOrderAvailability() {
    boolean result = true;
    for (Product el : this.getProducts()) {
      if (el != null) {
        if (el.getStock() < 10) {
          result = false;
          break;
        }
      }
    }
    return result;
  }
}
