package abstractObject;

public class Korean extends Hello {

	// 부모 클래스의 생성자 강제 호출
	public Korean(String msg) {
		super(msg);
	}

	/*
	 * 추상클래스는 이와 같이 자식 클래스가 정의해야 하는
	 * 규격을 강제하기 위하여 사용한다.
	 */
	@Override
	public void sayHello() {
		
	}

}
