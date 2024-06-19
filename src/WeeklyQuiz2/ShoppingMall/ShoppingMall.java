package WeeklyQuiz2.ShoppingMall;

import WeeklyQuiz2.Product.Product;

public abstract class ShoppingMall<T extends Product> {
  private T[] products;

  public ShoppingMall(int capacity) {
    this.products = (T[]) (new Product[capacity]);
  }

  public T[] getProducts() {
    return products;
  }

  public void addProduct(T product) {
    int length = products.length;
    for (int i = 0; i < length; i++) {
      if (products[i] == null) {
        products[i] = product;
        break;
      }

      if (products[length - 1] != null) {
        makeNewProductArr(product, length);
      }
    }
  }

  // 메서드 오버로딩
  public void removeProduct(T product) {
    for (T el : products) {
      if (el.equals(product)) {
        el = null;
        break;
      }
    }
  }

  // 메서드 오버로딩
  public void removeProduct(String name) {
    for (T el : products) {
      if (el.getName() == name) {
        el = null;
        break;
      }
    }
  }

  public void displayProducts() {
    System.out.println("[상품 목록]");
    for (T product : products) {
      if (product != null) {
        System.out.println("상품명: " + product.getName());
        System.out.println("상품 가격: " + product.getPrice());
        System.out.println("재고: " + product.getStock());
        System.out.println("=====================");
      }
    }
  }

  public abstract boolean checkOrderAvailability();

  private void makeNewProductArr(T product, int originLength) {
    T[] newProducts = (T[]) (new Object[originLength * 2]);
    for (int j = 0; j < newProducts.length; j++) {
      newProducts[j] = products[j];
    }
    newProducts[originLength] = product;
  }
}
