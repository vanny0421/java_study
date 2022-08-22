package cafeVersion2;

public class Coffee {
	
	String water;
	String sugar;
	String milk;
	String coffeeBean;
	String drink;
	
	public Coffee(String water, String sugar, String coffeeBean, String drink) {
		super();
		this.water = water;
		this.sugar = sugar;
		this.coffeeBean = coffeeBean;
		this.drink = drink;
	}

	public Coffee(String water, String sugar, String milk, String coffeeBean, String drink) {
		super();
		this.water = water;
		this.sugar = sugar;
		this.milk = milk;
		this.coffeeBean = coffeeBean;
		this.drink = drink;
	}

	public Coffee(String water, String coffeeBean, String drink) {
		super();
		this.water = water;
		this.coffeeBean = coffeeBean;
		this.drink = drink;
	}
}
