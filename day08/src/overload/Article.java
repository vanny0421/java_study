package overload;

public class Article {
	private int seq;
	private String subject;
	private String writer;
	
	public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public Article(int seq) {
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.writer = "익명";
		this(seq, "제목없음", "익명");
	}
	
	public Article(int seq, String subject) {
//		this.seq = seq;
//		this.subject = subject;
//		this.writer = "익명";
		this(seq, subject, "익명");
	}
	
	@Override
	public String toString() {
		return "Article [seq=" + seq + ", subject=" + subject + ", writer=" + writer + "]";
	}
}
