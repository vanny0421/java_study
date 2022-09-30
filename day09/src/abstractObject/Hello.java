package abstractObject;

public abstract class Hello {

	// 멤버변수
	private String msg;
	
	public Hello(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	// 추상 메서드
	public abstract void sayHello();
	
}
