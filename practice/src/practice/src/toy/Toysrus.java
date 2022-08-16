package toy;

public class Toysrus {

	public static void main(String[] args) {

		Child parkLaon = new Child(6);
		Child parkLuon = new Child(7);
		Child parkLeon = new Child(10, 160);
		Child parkStar = new Child("박스타");
		Child parkBentley = new Child("박벤틀리");
		Child parkTrimaje = new Child("박트리마제");
		
		parkLaon.playWithToy();
		parkLuon.playWithToy();
		parkLeon.playWithToy();
		parkStar.playWithToy();
		parkBentley.playWithToy();
		parkTrimaje.playWithToy();
		
	}
}
