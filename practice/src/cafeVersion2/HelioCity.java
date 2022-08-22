package cafeVersion2;

public class HelioCity {

	public static void main(String[] args) {
		
		Coffee[] orderList = new Coffee[20];
		Starbucks starbucks = new Starbucks(orderList, 0);
		Coffeebean coffeebean = new Coffeebean(orderList, 0);
		CafeBene cafeBene = new CafeBene(orderList, 0);

		Coffee americano1 = new Coffee("물", "설탕", "원두", "아메리카노");
		Coffee americano2 = new Coffee("물", "설탕", "원두", "아메리카노");
		Coffee latte1 = new Coffee("물", "설탕", "우유", "원두", "카페라떼");
		Coffee latte2 = new Coffee("물", "설탕", "우유", "원두", "카페라떼");
		Coffee latte3 = new Coffee("물", "설탕", "우유", "원두", "카페라떼");
		Coffee espresso1 = new Coffee("물", "원두", "에스프레소");
		Coffee espresso2 = new Coffee("물", "원두", "에스프레소");
		Coffee espresso3 = new Coffee("물", "원두", "에스프레소");
		Coffee espresso4 = new Coffee("물", "원두", "에스프레소");
		Coffee espresso5 = new Coffee("물", "원두", "에스프레소");
		
		starbucks.receiveOrder(espresso1);
		starbucks.receiveOrder(espresso2);
		starbucks.printOrderList(orderList);
		starbucks.makeCoffee(orderList);
		starbucks.makeCoffee(orderList);
		
		starbucks.printOrderList(orderList);
		
		coffeebean.receiveOrder(latte1);
		coffeebean.receiveOrder(latte2);
		coffeebean.printOrderList(orderList);
		coffeebean.makeCoffee(orderList);

		cafeBene.receiveOrder(americano1);
		cafeBene.receiveOrder(americano2);
		cafeBene.receiveOrder(latte3);
		cafeBene.receiveOrder(espresso3);
		cafeBene.receiveOrder(espresso4);
		cafeBene.receiveOrder(espresso5);
		cafeBene.printOrderList(orderList);
		
		cafeBene.makeCoffee(orderList);
		
		cafeBene.printOrderList(orderList);
	
	}
}
