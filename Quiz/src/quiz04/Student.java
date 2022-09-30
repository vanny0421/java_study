package quiz04;
/*  
 *  1. Student 클래스를 생성 한다.(10점)
 * 
 *  2. Student 클래스에 private 접근제어의 String 타입의 name, int 타입의 ban, no, kor, eng, math변수 선언(10점)
 * 
 *  3. 파라미터가 있는 생성자, getter, setter를 생성한다.(10)
 *  
 *  4. kor, eng, math의 총합을 return하는 메서드 생성.(10)
 *  
 *  5. kor, eng, math의 평균값을 return하는 메서드를 생성(10)
 *  
 *  6. name, ban, no, kor, eng, math 를 출력하는 메서드 생성(10)
 */
public class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int totalScore() {
		return kor + eng + math;
	}
	
	public int averageScore() {
		return (kor + eng + math) / 3;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", ban = " + ban + ", no = " + no + ", kor = " + kor + ", eng = " + eng + ", math = "
				+ math + "]";
	}
}
