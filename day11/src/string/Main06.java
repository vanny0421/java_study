package string;

public class Main06 {
	/*
	 * D:/photo/2022/travel/food.jpg 라는 파일이 있다.
	 * 다음의 형태로 출력, split() 사용 금지
	 * ------------------------------------------
	 * 파일이름 : food
	 * 확장자 : jpg
	 * 폴더명 : D:/photo/2022/travel
	 */
	public static void main(String[] args) {
		
		String filePath = "D:/photo/2022/travel/food.jpg";
		
		String fileName = filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));
		
		System.out.println("파일이름 : " + fileName);
		
		String extension = filePath.substring(filePath.lastIndexOf(".") + 1);
		
		System.out.println("확장자 : " + extension);
		
		System.out.println("폴더명 : " + filePath.substring(0, filePath.lastIndexOf("/")));
		
		
		
		
	}
	
}
