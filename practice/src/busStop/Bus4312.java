package busStop;

public class Bus4312 {

	public static void main(String[] args) {
		
		Person sunggoo = new Person("성구", 17);
		Person latte = new Person("라테", 30, "초록티셔츠");
		Person manchoo = new Person("만추", "흰 바지");
		
		Person[] seat = new Person[20];
		Bus bus = new Bus(seat, 0);
		
		bus.in(sunggoo);
		bus.in(latte);
		
		bus.out(sunggoo);
		bus.in(manchoo);
		
		bus.out(manchoo);
	
		bus.in(sunggoo);
		
		bus.out(latte);
		
	}
}
