package poketmon;

public class Field {

	public static void main(String[] args) {
		
		Poketmon[] poket = new Poketmon[10];
		
		Person jiwoo = new Person(poket, 0);
		
		Poketmon raichu = new Poketmon("라이츄", "주황색", "전기볼트");
		
		Poketmon turtleKing = new Poketmon("거북왕", "초록색");
		
		jiwoo.hunt(raichu);
		jiwoo.hunt(turtleKing);
		
		jiwoo.release();
		
	}
}
