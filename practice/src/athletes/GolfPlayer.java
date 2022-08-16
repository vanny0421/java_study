package athletes;

public class GolfPlayer implements Athletes {

	String ball;
	
	public GolfPlayer(String ball) {
		this.ball = ball;
	}
	
	@Override
	public void play() {
		System.out.println("골프선수는 " + ball + "을 가지고 운동한다.");
	}
}
