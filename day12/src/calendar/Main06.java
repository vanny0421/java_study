package calendar;

import java.util.Calendar;

public class Main06 {

	public static void main(String[] args) {
		
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, Calendar.MONTH, 1);
		
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-2; 
		int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		cal.set(Calendar.YEAR, Calendar.MONTH-2, 1);
		int yesterday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = yesterday-dayOfWeek+1; i <= yesterday; i++) {
			System.out.printf("%d\t",i);
			
		}	
		for (int i = 1; i <= dayOfMonth; i++) { // 전체일수 찍어야하기 때문에 <= 
			System.out.printf("%d\t",i);
			if((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}
		
		//달력 출력 후 뒷 부분의 빈 공간에 다음달 달력을 출력
		int afterDay = (7- (dayOfWeek + dayOfMonth)%7)%7; // 7%7 = 0
		for (int i = 1; i <= afterDay; i++) {
			System.out.printf("%d\t",i);
		}
		System.out.println();
	}	
}
