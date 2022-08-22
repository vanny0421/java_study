package cafeVersion2;

public class CafeBene implements Cafe {

	Coffee[] orderList;
	int index;
	String line;
	
	public CafeBene(Coffee[] orderList, int index) {
		super();
		this.orderList = orderList;
		this.index = index;
	}

	@Override
	public void makeCoffee(Coffee[] orderList) {
		line = "-----------------------\n";
		System.out.println(line);
		for (int i = 0; i < this.index; i++) {
				System.out.println("** 고객님");
				System.out.println("주문하신 🥛" + this.orderList[i].drink + "🥛 1잔 나왔습니다 ~ \n");
				index--;
		}
	}

	@Override
	public void receiveOrder(Coffee coffee) {
		orderList[index++] = coffee;
	}
	
	public void printOrderList(Coffee[] orderList) {
		line = "-----------------------\n";
		System.out.println(line + "\n　　 📌 주 문 목 록 📌\n");		
		if (index == 0) {
			System.out.println(" 　　주문이 없습니다 ㅠㅠ\n");
		} else {
			for (int i = 0; i < this.index; i++) {
				System.out.println("　　🥛☕ " + this.orderList[i].drink + " 🥤🧋\n");
			}
		}
	}
}
