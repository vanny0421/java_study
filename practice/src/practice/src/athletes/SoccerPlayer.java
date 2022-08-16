package athletes;

public class SoccerPlayer implements Athletes {
	
	String ball;
	String shoes;
	
	public SoccerPlayer(String ball, String shoes) {
		this.ball = ball;
		this.shoes = shoes;
	}

	@Override
	public void play() {
		System.out.println("축구선수는 " + shoes + "를 신고 " + ball + "을 가지고 운동한다.");
	}

}
