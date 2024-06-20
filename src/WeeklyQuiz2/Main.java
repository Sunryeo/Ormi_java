package WeeklyQuiz2;

import WeeklyQuiz2.Product.Clothing;
import WeeklyQuiz2.Product.Electronics;
import WeeklyQuiz2.Product.Food;
import WeeklyQuiz2.ShoppingMall.PremiumShoppingMall;

public class Main {

  public static void main(String[] args) {
    // 의류 쇼핑몰
    System.out.println("@@의류 쇼핑몰@@");
    PremiumShoppingMall<Clothing> clothingPremiumShoppingMall = new PremiumShoppingMall<>(2);
    // 상품 추가
    Clothing blouseL = new Clothing("블라우스", 20000, 20, Size.L);
    Clothing jeanM = new Clothing("청바지", 30000, 15, Size.M);
    Clothing jacketS = new Clothing("자켓", 50000, 13, Size.S);
    clothingPremiumShoppingMall.addProduct(blouseL);
    clothingPremiumShoppingMall.addProduct(jeanM);
    clothingPremiumShoppingMall.addProduct(jacketS);
    // 상품 출력
    System.out.println();
    clothingPremiumShoppingMall.displayProducts();

    System.out.println("[사이즈별 가격 출력]");
    System.out.println("L 사이즈 블라우스 정가: " + blouseL.getPrice());
    System.out.println("L 사이즈 블라우스 계산가: " + blouseL.calculatePrice(1));
    System.out.println("M 사이즈 청바지 정가: " + jeanM.getPrice());
    System.out.println("M 사이즈 청바지 계산가: " + jeanM.calculatePrice(1));

    // 상품 삭제
    clothingPremiumShoppingMall.removeProduct(blouseL);
    clothingPremiumShoppingMall.removeProduct("청바지");

    System.out.println("상품 삭제 후-------------");
    // 상품 출력
    clothingPremiumShoppingMall.displayProducts();

    // 구매 가능 여부
    boolean isAvailable = clothingPremiumShoppingMall.checkOrderAvailability();
    System.out.println("구매가능여부: " + isAvailable);

    if (isAvailable) {
      System.out.println("자켓 2벌 구매시 가격: " + jacketS.calculatePrice(2));
      System.out.println("남은 재고: " + jacketS.getStock());
    }

    // 전자제품 쇼핑몰
    System.out.println();
    System.out.println("@@전자제품 쇼핑몰@@");
    PremiumShoppingMall<Electronics> electronicsPremiumShoppingMall = new PremiumShoppingMall<>(10);
    // 상품 추가
    Electronics refrigerator = new Electronics("냉장고", 1000000, 15, Brand.Samsung);
    Electronics vacuumCleaner = new Electronics("청소기", 1000000, 14, Brand.Dyson);
    Electronics iphone = new Electronics("아이폰", 1500000, 20, Brand.Apple);
    electronicsPremiumShoppingMall.addProduct(refrigerator);
    electronicsPremiumShoppingMall.addProduct(vacuumCleaner);
    electronicsPremiumShoppingMall.addProduct(iphone);

    // 상품 출력
    System.out.println();
    electronicsPremiumShoppingMall.displayProducts();

    System.out.println("[브랜드별 가격 출력]");
    System.out.println("삼성 냉장고 정가: " + refrigerator.getPrice());
    System.out.println("삼성 냉장고 계산가: " + refrigerator.calculatePrice(1));
    System.out.println("아이폰 정가: " + iphone.getPrice());
    System.out.println("아이폰 계산가: " + iphone.calculatePrice(1));

    // 상품 삭제
    electronicsPremiumShoppingMall.removeProduct("냉장고");
    electronicsPremiumShoppingMall.removeProduct(vacuumCleaner);

    // 상품 출력
    System.out.println("상품 삭제 후-----------");
    electronicsPremiumShoppingMall.displayProducts();

    // 구매 가능 여부
    boolean isAvailable2 = electronicsPremiumShoppingMall.checkOrderAvailability();
    System.out.println("구매가능여부: " + isAvailable);

    if (isAvailable2) {
      System.out.println("아이폰 2대 구매시 가격: " + iphone.calculatePrice(2));
      System.out.println("남은 재고: " + iphone.getStock());
    }

    // 음식물 쇼핑몰
    System.out.println();
    System.out.println("@@음식물 쇼핑몰@@");
    PremiumShoppingMall<Food> foodPremiumShoppingMall = new PremiumShoppingMall<>(10);

    // 상품 추가
    Food milk = new Food("우유", 2000, 20, "2024-06-23");
    Food jelly = new Food("곤약젤리", 1700, 30, "2024-09-30");
    Food yogurt = new Food("야쿠르트", 700, 9, "2024-07-01");
    foodPremiumShoppingMall.addProduct(milk);
    foodPremiumShoppingMall.addProduct(jelly);
    foodPremiumShoppingMall.addProduct(yogurt);

    // 상품 출력
    System.out.println();
    foodPremiumShoppingMall.displayProducts();

    System.out.println("[유통기한별 가격 출력]");
    System.out.println("우유 유통기한: " + milk.getExpirationDate());
    System.out.println("우유 정가: " + milk.getPrice());
    System.out.println("우유 할인가: " + milk.calculatePrice(1));
    System.out.println("곤약젤리 유통기한: " + jelly.getExpirationDate());
    System.out.println("곤약젤리 정가: " + jelly.getPrice());
    System.out.println("곤약젤리 할인가: " + jelly.calculatePrice(1));

    // 상품 삭제
    foodPremiumShoppingMall.removeProduct(milk);
    foodPremiumShoppingMall.removeProduct("곤약젤리");

    // 상품 출력
    System.out.println("상품 삭제 후-----------");
    foodPremiumShoppingMall.displayProducts();

    // 구매 가능 여부
    boolean isAvailable3 = foodPremiumShoppingMall.checkOrderAvailability();
    System.out.println("구매가능여부: " + isAvailable3);

    if (isAvailable3) {
      System.out.println("야쿠르트 2병 구매시 가격: " + yogurt.calculatePrice(2));
      System.out.println("남은 재고: " + yogurt.getStock());
    }
  }
}
