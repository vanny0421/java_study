package quiz07_arraylist;

import java.util.ArrayList;
/* 

7. Student 객체를 담기위한 arraylist 생성.(객체명 자유)(10) ✓

8. 7번에서 생성한 객체에 for문을 사용하여 10명의 학생 데이터를 임의로 각각 다르게 add한다.(5) ✓

9. 7번에서 생성한 arraylist의 크기를 출력한다.(10) ✓

10. 7번에서 생성한 arraylist의 5번째 요소를 출력한다.(5) ✓
 
11. 7번에서 생성한 arraylist의 5번째 요소를 삭제한다.(5) ✓

12. 7번에서 생성한 arraylist에 담긴 데이터를 for문과 Student 클래스에서 생성한 toString() 메서드를 사용하여 출력한다.(5) ✓

*/
public class Main01 {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		for(int i=0; i<10; i++){
			Student student = new Student("학생" + (i+1), "010-1234-123" + i, "강남구 역삼" + (i+1) + "동");
			studentList.add(student);
		}
		
		System.out.println("arrayList의 크기 : " + studentList.size() + "\n");
		
		System.out.println("arrayList의 5번째 요소 : \n" + studentList.get(4) + "\n");
		
		// 5번째 요소 삭제
		studentList.remove(4);
		
		System.out.println("-----------------------------------\n"
				+ "for문과 toString() 메서드 사용해서 출력 ↓\n");
		
		for(int i=0; i<studentList.size(); i++) {
			Student list = studentList.get(i);
			System.out.println(list.toString());
		}
	}
}
	