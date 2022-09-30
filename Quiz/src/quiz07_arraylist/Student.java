package quiz07_arraylist;

/*  collection framework 중의 하나인 arraylist를 사용해서 학생 관리를 하자.
 
1. java 프로젝트 생성하여(이름은 자유) arraylist package를 생성한다.(10) ✓
 
2. arraylist package안에 Student 클래스, main 메서드를 포함하고있는 클래스(이름은 자유)를 생성한다.(10) ✓

3. Student class에, 학생관리를 위한 학생이름, 휴대폰번호, 주소를 담을 접근제어 private 전역변수 3개만 생성한다.(10) ✓

4. 3개의 파라미터(매개변수)를 받아서  각각의 전역변수에 값을 할당해주는 생성자를 생성한다.(10) ✓
 
5. 3번에서 선언한 3개의 전역변수의 getter, setter를 만든다.(10) ✓

6. toString() 메서드를 override해서 해당 클래스명, 각각의 전역변수를 출력해주는 메서드를 생성한다(어노테이션 필수).(10) ✓

*/

public class Student {
	private String studentName;
	private String studentPhoneNum;
	private String studentAddress;
	
	public Student(String studentName, String studentPhoneNum, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentPhoneNum = studentPhoneNum;
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhoneNum() {
		return studentPhoneNum;
	}

	public void setStudentPhoneNum(String studentPhoneNum) {
		this.studentPhoneNum = studentPhoneNum;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [ClassName=" + Student.class.getSimpleName() + ", studentName=" + studentName + ", studentPhoneNum=" + studentPhoneNum + ", studentAddress="
				+ studentAddress + "]";
	}
}
