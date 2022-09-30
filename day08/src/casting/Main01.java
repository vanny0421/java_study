package casting;

class Hello{
	public void say() {
		System.out.println("Hello");
	}
}

class Korean extends Hello{
	@Override
	public void say() {
		System.out.println("안녕하세요");
	}
	
	public void talk() {
		System.out.println("또 만났군요.");
	}
}

public class Main01 {

	public static void main(String[] args) {
		Hello k = new Korean();
		k.say();
		// Hello에게 정의된 기능이 아니므로 에러
		//k.talk();
	}

}













