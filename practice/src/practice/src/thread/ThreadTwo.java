package thread;

public class ThreadTwo implements Threading {

	@Override
	public void starting() {
		System.out.println("쓰레드2　　작동시작");
	}

	@Override
	public void working() {
		System.out.println("쓰레드2　　작동중");
	}
}
