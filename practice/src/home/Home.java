package home;

import java.util.Scanner;

public class Home {

	Refrigerator refrigerator;

	public Home() {
		refrigerator = new Refrigerator();
		refrigerator.food = new String[5];
	}

	public void addFood() {
		Scanner sc = new Scanner(System.in);

		refrigerator.food[refrigerator.index++] = sc.next();
		refrigerator.food[refrigerator.index++] = sc.next();
		refrigerator.food[refrigerator.index++] = sc.next();
		refrigerator.food[refrigerator.index++] = sc.next();
		refrigerator.food[refrigerator.index] = sc.next();
	}

	public void printFood() {
		System.out.println(refrigerator.food[0]);
		System.out.println(refrigerator.food[1]);
		System.out.println(refrigerator.food[2]);
		System.out.println(refrigerator.food[3]);
		System.out.println(refrigerator.food[4]);
	}
}
