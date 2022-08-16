package thread;

public class ThreadThree implements Threading {

	@Override
	public void starting() {
		System.out.println("쓰레드3　　작동시작");
	}

	@Override
	public void working() {
		System.out.println("쓰레드3　　작동중");
	}
}
