package patterncheck;

import java.util.regex.Pattern;

public class RegexHelper {
	// 싱글톤 객체 생성
	private static RegexHelper regexHelper = new RegexHelper();
	
	private RegexHelper() {}
	
	public static RegexHelper getInstance() {
		return regexHelper;
	}
	
	/*
	 * 주어진 문자열이 공백이거나 null인지 검사
	 * @param	str			- 검색할 문자열
	 * @return	boolean		- 공백, null이 아닐 경우 true 리턴
	 */

	public boolean checkNull(String str) {
		if (str == null || str.isEmpty() || str.equals(" ")) {
			return false;
		} 
		return true;			
	}
	
	
	/*
	 * 숫자 모양에 대한 형식 검사
	 * @param	str			- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean checkNum(String str) {
		if (!Pattern.matches("^[0-9]*$", str)) {
			return false;
		}
		return true;
	}
	
	/*
	 * 영문으로만 구성되었는지에 대한 형식 검사
	 * @param	str			- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean checkEng(String str) {
		if (!Pattern.matches("^[a-zA-Z]*$", str)) {
			return false;
		}
		return true;
	}
	
	/*
	 * 한글로만 구성되었는지에 대한 형식 검사
	 * @param	str			- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean checkKor(String str) {
		if (!Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str)) {
			return false;
		}
		return true;
	}
	
	/*
	 * 영문과 숫자로만 구성되었는지에 대한 형식 검사
	 * @param	str			- 검사할 문자열
	 * @return	boolean		- 형식에 맞을 경우 true, 맞지 않을 경우 false
	 */
	public boolean checkEngNum(String str) {
//		if (!Pattern.matches("^[a-zA-Z0-9]*$", str)) {
//			return false;
//		}
//		return true;
		return !Pattern.matches("^[a-zA-Z0-9]*$", str) ? true : false;
		
	}
	
	public boolean checkEmail(String str) {
		if (!Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", str)) {
			return false;
		}
		return true;
	}
}
