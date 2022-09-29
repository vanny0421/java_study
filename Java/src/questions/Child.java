package questions;

public class Child {

	int ballCnt ;
	
	public Child( int ballCnt ) {
		
		this.ballCnt = ballCnt >= 0 ? ballCnt : 0 ;
		
	}
	
	void earnBalls( Child enemy , int ballCnt ) {
		
		int earnedBallsCnt = enemy.ballCnt >= ballCnt ? ballCnt : enemy.ballCnt ;
		
		this.ballCnt += earnedBallsCnt ;
		
		enemy.loseBalls( earnedBallsCnt );
		
	}
	
	void loseBalls( int ballCnt ) {
		
		this.ballCnt -= ballCnt ;
		
	}
	
	void printBalances( Child enemy ) {
		
		System.out.println("--------갱신--------\n");
		
		System.out.println( "어린이1 구슬 : " + this.ballCnt );
		
		System.out.println( "어린이2 구슬 : " + enemy.ballCnt );
		
	}
	
	public static void main(String[] args) {
		
		Child ch1 = new Child( 15 ) ;
		
		Child ch2 = new Child( 9 ) ;
		
		ch1.printBalances(ch2);
		
		ch1.earnBalls( ch2 , 2 );
		
		ch1.printBalances(ch2);
		
		ch2.earnBalls( ch1 , 7 );
		
		ch1.printBalances(ch2);
		
	}
}
