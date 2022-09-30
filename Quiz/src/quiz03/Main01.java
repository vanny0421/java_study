package quiz03;

import java.util.Scanner;
/*
 *  7. main 메서드를 포함하는 클래스를 생성 한다.(10점)
 *  
 *  8. 2개의 정수를 입력 받는다.(10점)
 *  
 *  9. 입력 받은 정수를 각각 출력 한다.(10점)
 *  
 *  10. main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.(5점)
 *  
 *  11. main 메서드에서 본인의 이름을 출력한다.(5점)
 *  
 *  12. Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
 *  
 *  13. Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)
 */
public class Main01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("2번 정수 : ");
		int num2 = sc.nextInt();
		System.out.println("------출력------");
		System.out.println("1번 정수 = " + num1);
		System.out.println("2번 정수 = " + num2);
		
		
		System.out.println("---------------");
		Calc calc = new Calc("김이영");		
		System.out.println("이름 : " + calc.getName());
		
		System.out.println("---------------");
		
		System.out.println("10 + 2 = " + calc.plus(10, 2));
		System.out.println("10 - 2 = " + calc.minus(10, 2));
		System.out.println("10 * 2 = " + calc.times(10, 2));
		System.out.println("10 / 2 = " + calc.divide(10, 2));
	}
}
