package cafe;

public class Caf {
	
	public static void main(String[] args) {
		
		TwosomePlace cafeLatte = new TwosomePlace("카페라떼", 4500);
		TwosomePlace iceAmericano =  new TwosomePlace("아이스 아메리카노", "계피향", 4000);
		TwosomePlace iceChocolatePlusCake = new TwosomePlace("아이스 초콜릿", "클래식 가토쇼콜라", "계피향", 10500);
		
		
		cafeLatte.makeCoffee();
		iceAmericano.makeCoffee();
		iceChocolatePlusCake.makeCoffee();
		
	}
}
