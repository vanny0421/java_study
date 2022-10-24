package part2_Question1;

import java.util.Scanner;

public class LogicalOperation {
	
	public static void main(String[] args) {
		
		System.out.print("논리 연산을 입력하세요>>");
		Scanner sc = new Scanner(System.in);

		boolean a = sc.nextBoolean();
		String operator = sc.next();
		boolean b = sc.nextBoolean();

		switch (operator) {
		case "AND":
			System.out.println(a & b);
			break;
		case "OR":
			System.out.println(a || b);
			break;
		}
	}
}
