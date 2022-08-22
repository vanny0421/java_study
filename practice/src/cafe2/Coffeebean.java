package cafe2;

public class Coffeebean implements Cafe {

	Coffee[] orderList;
	int index;
	String line;
	
	public Coffeebean(Coffee[] orderList, int index) {
		super();
		this.orderList = orderList;
		this.index = index;
	}

	@Override
	public void makeCoffee(Coffee[] orderList) {
		line = "-----------------------\n";
		System.out.println(line);
		for(int i=0;i<this.index;i++) {
			if(orderList[i] != null) {
				System.out.println("　주문하신 " + this.orderList[i].drink + "🥛 나왔습니다 ~ \n");
				this.orderList[i] = null;
			}
		}
	}

	@Override
	public void receiveOrder(Coffee coffee) {
		orderList[index++] = coffee;
		line = "-----------------------\n";
		System.out.println(line);
		System.out.println(" 👩🏻‍🤝‍👨🏻어서오세요 커피빈 입니다 \n");
		System.out.println("　📢 주문이 들어왔습니다 📢 \n");
		for(int i=0;i<this.index;i++) {
			if(orderList[i] != null) {
				System.out.println("　　 📌 주 문 목 록 📌\n");
				System.out.println("　🥛☕ " + orderList[i].drink + " 1개 🥤🧋\n");
			}
		}
	}
	public void printOrderList(Coffee[] orderList) {
		line = "-----------------------\n";
		System.out.println(line);
		System.out.println("　　 📌 주 문 목 록 📌\n");
		
		for (int i = 0; i < this.index; i++) {
			if (orderList[i] != null) {
				System.out.println("　　🥛☕ " + orderList[i].drink + " 🥤🧋\n");
			} 
		}
	}
}
