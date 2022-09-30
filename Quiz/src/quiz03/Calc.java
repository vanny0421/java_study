package quiz03;

/*  1. Calc 클래스를 생성 한다.(10점)
 * 
 *  2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.(10점)
 *  
 *  3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.(5점)
 *  
 *  4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.(5점)
 *  
 *  5. int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.(5점)
 *  
 *  6. int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다. (5점) 
 */
public class Calc { 
	
	private String name;
	
	public Calc(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int plus(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int times(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		int equals = 0;
		if(b!=0) {
			equals = a / b; 
		}
		return equals;
	}
}
