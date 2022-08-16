package thread;

public class ThreadOne implements Threading {

	@Override
	public void starting() {
		System.out.println("쓰레드 1　　작동시작");
	}

	@Override
	public void working() {
		System.out.println("쓰레드 1　　작동중");
	}
}
