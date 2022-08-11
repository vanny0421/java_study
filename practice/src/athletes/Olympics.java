package athletes;

public class Olympics {

	public static void main(String[] args) {
		

		SoccerPlayer sp = new SoccerPlayer("축구공", "축구화");
		GolfPlayer gp = new GolfPlayer("골프공");
		BasketballPlayer bp = new BasketballPlayer("농구공");
		
		sp.play();
		gp.play();
		bp.play();
		
		System.out.println();
		
		System.out.println("농구선수가 농구공을 축구선수한테 준다.");
		sp.ball = bp.ball;
		sp.play();

	}
}
