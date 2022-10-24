package part1_Question2;

public class Student {
	String department;
	int studentNo;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setDepartment("컴퓨터공학부");
		student.setStudentNo(1000000);
		
		System.out.println(student.department);
		System.out.println(student.studentNo);
	}
}
