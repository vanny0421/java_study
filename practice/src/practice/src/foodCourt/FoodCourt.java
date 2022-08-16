package foodCourt;

public class FoodCourt implements BurgerKing, Starbucks{

	@Override
	public void makeCoffee() {
		System.out.println("커피를 만들었습니다.");
	}

	@Override
	public void makeBurger() {
		System.out.println("버거를 만들었습니다.");
	}

	public void sell() {
		makeBurger();
		System.out.println("바로 판매되었습니다.");
		makeCoffee();
		System.out.println("바로 판매되었습니다.");
	}
	
}
