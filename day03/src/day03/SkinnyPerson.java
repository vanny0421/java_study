package day03;

public class SkinnyPerson implements Behavior {

	@Override
	public void behavior() {
		System.out.println("계속 움직인다");
	}

	@Override
	public void eat() {
		System.out.println("적당히 먹는다");
	}
	
	
}
