package patterncheck;

import java.util.regex.Pattern;

public class RegexHelper_t {
	// 싱글톤 객체 생성
	// -- 싱글톤 객체 생성 시작
	private static RegexHelper_t regexHelper;

	// 객체가 할당되지 않은 경우메나 할당하도록 하여 중복 할당을 방지한다.
	public static RegexHelper_t getInstance() {
		
		if( regexHelper == null ) {
			regexHelper = new RegexHelper_t();
		}
		
		return regexHelper;
	}
	
	// 객체에 null을 대입하면 메모리에서 삭제된다.
	public static void freeInstance() {
		regexHelper = null;
	}
	
	// 기본 생성자를 private 형태로 정의하면 객체 생성자가 은닉 처리되어
	// 외부에서 new 연산자를 사용한 객체할당이 금지된다.
	private RegexHelper_t(){	}
	// -- 싱글톤 객체 생성 끝
	
	/*
	 * 주어진 문자열이 공백이거나 null인지 검사
	 * @param 	str 		- 검색할 문자열
	 * @return	boolean		- 공백, null이 아닐 경우 true 리턴
	 */
	public boolean isValue(String str) {
		boolean result = false;
		
		if( str != null ) {
			result = !str.trim().equals("");
		}
		
		return result;
	}
	
	/*
	 * 숫자 모양에 대한 형식 검사
	 * @param 	str 		- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을경우 false 
	 */
	public boolean isNum( String str ) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		
		return result;
	}
	
	/*
	 * 영문으로만 구성되었는지에 대한 형식 검사
	 * @param 	str 		- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을경우 false 
	 */
	public boolean isEng( String str ) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[a-zA-Z]*$", str);
		}
		
		return result;
	}
	
	/*
	 * 한글로만 구성되었는지에 대한 형식 검사
	 * @param 	str 		- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을경우 false 
	 */
	public boolean isKor( String str ) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		
		return result;
	}
	
	/*
	 * 영문과 숫자로만 구성되었는지에 대한 형식 검사
	 * @param 	str 		- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을경우 false 
	 */
	public boolean isEngNum( String str ) {
		boolean result = false;
		
		if( isValue(str) ) {
			result = Pattern.matches("^[a-zA-Z0-9]*$", str);
		}
		
		return result;
	}
	
}








