package cafe;

public class TwosomePlace implements Cafe {

	String drink;
	String spice;
	String cake;
	int price;

	public TwosomePlace(String drink, int price) {
		this.drink = drink;
		this.price = price;
	}

	public TwosomePlace(String drink, String spice, int price) {
		this.drink = drink;
		this.spice = spice;
		this.price = price;
	}

	public TwosomePlace(String drink, String spice, String cake, int price) {
		this.drink = drink;
		this.spice = spice;
		this.cake = cake;
		this.price = price;
	}

	@Override
	public void makeCoffee() {

		if (this.drink != null && this.cake != null && this.spice != null) {
			System.out.println(this.drink + ", " + this.cake + " " + this.price + "원 " + this.spice + " 결제 되었습니다.");
		} else if (this.cake == null && this.spice == null) {
			System.out.println(this.drink + " " + this.price + "원 결제 되었습니다.");
		} else {
			System.out.println(this.drink + " " + this.price + "원 " + this.spice + " 결제 되었습니다.");
		}
	}
}
