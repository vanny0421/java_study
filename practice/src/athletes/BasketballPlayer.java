package athletes;

public class BasketballPlayer implements Athletes {

	String ball;
	
	public BasketballPlayer(String ball) {
		this.ball = ball;
	}
	
	@Override
	public void play() {
		System.out.println("농구선수는 " + ball + "을 가지고 운동한다.");		
	}

}
