package scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("int type 입력 : ");
		int i = sc.nextInt();
		System.out.println("int 결과 : " + i);
		
		System.out.print("String 입력 : ");
		String s = sc.next();
		System.out.println("String 결과 : " + s);
		
		sc.close();
	}
}
