package mian;

class One {
	int a;
	int b;
	int c;
}

class Two {
	One one;
	
	public Two(One one) {
		this.one = one;
	}
}

class Three {
	Two two;
	
	public Three(Two two) {
		this.two = two;
	}
}

class Four {
	One one;
	Two two;
	Three three;
	
	public Four(One one, Two two, Three three) {
		this.one = one;
		this.two = two;
		this.three = three;
	}
}

public class Main01 {
	
	public static void main(String[] args) {
	
		One one = new One();
		Two two = new Two(one);
		
		two.one.a = 7;
		two.one.b = 10;
		
		Three three = new Three(two);
		
		System.out.println(two.one.a);
		System.out.println(two.one.b);

		three.two.one.a = 10;
		three.two.one.b = 70;
		three.two.one.c = 100;
		
		System.out.println(three.two.one.a);
		System.out.println(three.two.one.b);
		System.out.println(three.two.one.c);
		
		Four four = new Four(one, two, three);
	}
}
