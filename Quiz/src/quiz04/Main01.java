package quiz04;
/*
 *  7. main 메서드를 포함하는 클래스를 생성(10)
 *  
 *  8. Student 클래스 객체 생성(10)
 *  
 *  9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출(10)
 *  
 *  10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출(10) 
 */
public class Main01 {
	
	public static void main(String[] args) {
		
		Student vanny = new Student("김베니", 8, 5, 80, 100, 90);
		
		System.out.println("총 합 : " + vanny.totalScore());
		System.out.println("평균 값 : " + vanny.averageScore());
		
		System.out.println(vanny.toString());
	}
}
