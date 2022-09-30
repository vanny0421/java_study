package number;

import java.util.Scanner;

class MainVendingMachine {
	
	public String choose1() {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			if (choice == 1) {
				VendingMachine1 vm1 = new VendingMachine1();
				return vm1.choose();
			} else if (choice == 2) {
				VendingMachine2 vm2 = new VendingMachine2();
				return vm2.choose();
			} else {
				return "1과 2중에 선택해주세요.";
			}
		}
	}
	
}
public class VendingMachine1 {
	
	public String choose() {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int num = Integer.parseInt(st);
		
		switch(num) {
			case 1:
				return "콜라";
			case 2:
				return "담배";
			case 3:
				return "사이다";
			case 4:
				return "팥빙수";
			default :
				return "1-4중에 선택하세요";
		}
	}
	
	public static void main(String[] args) {
		
//		Switch sw = new Switch();
//		sw.choose();
		
//		VendingMachine vm = new VendingMachine();
//		vm.choose();

		MainVendingMachine mvm = new MainVendingMachine();
		
		System.out.println(mvm.choose1());
		
		
	}

}
