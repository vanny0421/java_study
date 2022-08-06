package day03;

public class FatPerson implements Behavior {

	@Override
	public void behavior() {
		System.out.println("안움직인다");
	}

	@Override
	public void eat() {
		System.out.println("많이 먹는다");
	}
	
}
