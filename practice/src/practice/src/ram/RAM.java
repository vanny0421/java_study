package ram;

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


public class RAM {
	public static void main(String[] args) {
		One one = new One();
		Two two = new Two(one);
		
		two.one.a = 7;
		two.one.b = 10;
		System.out.println(two.one.a);
		System.out.println(two.one.b);
		
		
		Three three = new Three(two);
		
		three.two.one.a = 10;
		three.two.one.b = 70;
		three.two.one.c = 100;
		
		System.out.println(three.two.one.a);
		System.out.println(three.two.one.b);
		System.out.println(three.two.one.c);
	}
	
}
