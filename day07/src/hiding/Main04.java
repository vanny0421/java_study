package hiding;

public class Main04 {

	public static void main(String[] args) {
		// 객체생성
		Article a = new Article(1, "자바의 정석", "자바는 객체지향 언어이다.", "남궁 성", 101, "2022-08-16");
		
		// 출력
		System.out.println("글 번호 : " + a.getSeq());
		System.out.println("글 제목 : " + a.getSubject());
		System.out.println("글 내용 : " + a.getContent());
		System.out.println("작성자 : " + a.getWriter());
		System.out.println("조회수 : " + a.getHit());
		System.out.println("작성일시 : " +a.getRegDate());
	}
}
