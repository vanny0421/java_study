package thread;

public class Threadin {

	public static void main(String[] args) throws Exception {
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		ThreadThree t3 = new ThreadThree();

		try {
			while (true) {
				Thread.sleep(2000);
				t1.starting();
				Thread.sleep(2000);
				t1.working();
				Thread.sleep(2000);
				t2.starting();
				Thread.sleep(2000);
				t2.working();
				Thread.sleep(2000);
				t3.starting();
				Thread.sleep(2000);
				t3.working();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
