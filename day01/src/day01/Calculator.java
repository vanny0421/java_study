package day01;

public class Calculator {
	Division div = null;
	Minus min = null;
	Multiply mul = null;
	Plus plus = null;
	
	public Calculator() {
		this.div = new Division();
		this.min = new Minus();
		this.mul = new Multiply();
		this.plus = new Plus();
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		//2개의 숫자를 집어넣어 연산을 하는 프로그램입니다.
		
		// 1 + 5 의 결과를 출력할 수 있도록 코드를 변경하세요 
		calc.plus.oper(1,5);
		// 5 - 3 의 결과를 출력할 수 있도록 코드를 변경하세요
		calc.min.oper(5,3);
		// 10 * 10 의 결과를 출력할 수 있도록 코드를 변경하세요
		calc.mul.oper(10,10);
		// 100 / 20 의 결과를 출력할 수 있도록 코드를 변경하세요
		calc.div.oper(100,20);
		
	}
}
