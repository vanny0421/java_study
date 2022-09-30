package array;

public class Main01 {

	public static void main(String[] args) {
		/* 배열의 생성 */
		
		// 배열의 선언과 크기 지정 및 값의 할당에 대한 개별 처리
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		// 배열의 선언과 크기 지정의 일괄처리
		int[] douneo = new int[3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
	
		// 배열 생성의 일괄처리
		int[] ddochy = new int[] {100, 100, 90};
		
		/* 배열의 활용 */
		//	반복문 각각의 총합, 평균 출력까지
		
		int doolyTotal = 0;
		float doolyAvg = 0F;
		
		for(int i=0;i<dooly.length;i++) {
			doolyTotal+=dooly[i];
		}
		doolyAvg = doolyTotal/(float)dooly.length;
		
		System.out.println("둘리 총점 = " + doolyTotal);
		System.out.println("둘리 평균 = " + doolyAvg);

		System.out.println();
		
		int douneoTotal = 0;
		float douneoAvg = 0F;
		
		for(int i=0;i<douneo.length;i++) {
			douneoTotal+=douneo[i];
		}
		douneoAvg = douneoTotal/(float)douneo.length;
		
		System.out.println("도우너 총점 = " + douneoTotal);
		System.out.println("도우너 평균 = " + douneoAvg);
	
		System.out.println();
	
		int ddochyTotal = 0;
		float ddochyAvg = 0F;
		
		for(int i=0;i<ddochy.length;i++) {
			ddochyTotal+=ddochy[i];
		}
		ddochyAvg = ddochyTotal/(float)ddochy.length;
		
		System.out.println("또치 총점 = " + ddochyTotal);
		System.out.println("또치 평균 = " + ddochyAvg);
	
	}
}
