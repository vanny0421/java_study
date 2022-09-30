package multiex;

public class Q3 implements Operation {

	@Override
	public void oper() {
		int b = 0;
		
		int j = 1;
		do {
			b+=7;
			j++;
			System.out.println(b);
		} while(j<=9);
		
	}
}
