package day03;

public class Bi implements Behavior {

	@Override
	public void eat() {
		System.out.println("게이같이 먹는다");
	}

	@Override
	public void behavior() {
		System.out.println("여자같이 행동한다");
	}

}
