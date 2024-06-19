package WeeklyQuiz2;

import WeeklyQuiz2.Product.Clothing;
import WeeklyQuiz2.Product.Electronics;
import WeeklyQuiz2.Product.Food;
import WeeklyQuiz2.ShoppingMall.PremiumShoppingMall;

public class Main {

  public static void main(String[] args) {
    // 의류 쇼핑몰
    PremiumShoppingMall<Clothing> clothingPremiumShoppingMall = new PremiumShoppingMall<>(10);
    // 상품 추가
    Clothing blouseL = new Clothing("블라우스", 20000, 20, Size.L);
    Clothing jeanM = new Clothing("청바지", 30000, 15, Size.M);
    Clothing jacketS = new Clothing("자켓", 50000, 13, Size.S);
    clothingPremiumShoppingMall.addProduct(blouseL);
    clothingPremiumShoppingMall.addProduct(jeanM);
    clothingPremiumShoppingMall.addProduct(jacketS);
    // 상품 출력
    clothingPremiumShoppingMall.displayProducts();
    // 상품 삭제
    clothingPremiumShoppingMall.removeProduct(blouseL);
    clothingPremiumShoppingMall.removeProduct("청바지");

    // 구매 가능 여부
    boolean isAvailable = clothingPremiumShoppingMall.checkOrderAvailability();
    System.out.println("구매가능여부: " + isAvailable);

    if (isAvailable) {
      System.out.println(jacketS.calculatePrice(2));
      System.out.println(jacketS.getStock());
    }

    // 전자제품 쇼핑몰
    PremiumShoppingMall<Electronics> electronicsPremiumShoppingMall = new PremiumShoppingMall<>(10);
    // 상품 추가
    Electronics refrigerator = new Electronics("냉장고", 1000000, 15, "삼성");
    Electronics vacuumCleaner = new Electronics("청소기", 1000000, 14, "다이슨");
    Electronics washingMachine = new Electronics("세탁기", 1500000, 20, "LG");

    electronicsPremiumShoppingMall.addProduct(refrigerator);
    electronicsPremiumShoppingMall.addProduct(vacuumCleaner);
    electronicsPremiumShoppingMall.addProduct(washingMachine);

    // 상품 출력
    electronicsPremiumShoppingMall.displayProducts();

    // 상품 삭제
    electronicsPremiumShoppingMall.removeProduct("냉장고");
    electronicsPremiumShoppingMall.removeProduct(vacuumCleaner);

    // 구매 가능 여부
    boolean isAvailable2 = electronicsPremiumShoppingMall.checkOrderAvailability();
    System.out.println("구매가능여부: " + isAvailable);

    if (isAvailable2) {
      System.out.println(washingMachine.calculatePrice(2));
      System.out.println(washingMachine.getStock());
    }

    // 음식물 쇼핑몰
    PremiumShoppingMall<Food> foodPremiumShoppingMall = new PremiumShoppingMall<>(10);
    Food milk = new Food("우유", 2000, 20, "2024-06-30");
    System.out.println(milk.calculatePrice(1));
  }
}
