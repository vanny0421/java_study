package overload;

public class Main03 {

	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println(m1.toString());
		
		Member m2 = new Member(19);
		System.out.println(m2.toString());
		
		Member m3 = new Member("학생");
		System.out.println(m3.toString());
		
		Member m4 = new Member("개발자", 30);
		System.out.println(m4.toString());
		
	}
}
