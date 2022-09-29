package questions;

class Child {

	int marbleCnt;

	public Child(int marbleCnt) {
		if (marbleCnt >= 0) {
			this.marbleCnt = marbleCnt;
		} else {
			this.marbleCnt = 0;
		}
	}
	
	void earnMarble(Child child, int cnt) {
		int earnedMarbleCnt;
		
		if (child.marbleCnt >= cnt) {
			earnedMarbleCnt = cnt;
		} else {
			earnedMarbleCnt = child.marbleCnt;
		}
		
		this.marbleCnt += earnedMarbleCnt;
		
		child.loseMarble(earnedMarbleCnt);
	}
	
	void loseMarble(int lostCnt) {
		this.marbleCnt -= lostCnt;
	}
	
	void checkMarble(Child child) {
		System.out.println("---------------------------");
		System.out.println("어린이1 갖고있는 구슬 개수 : " + this.marbleCnt);
		System.out.println("어린이2 갖고있는 구슬 개수 : " + child.marbleCnt);
	}
}

public class Question04 {

	public static void main(String[] args) {
		
		Child child1 = new Child(15);
		Child child2 = new Child(9);
		
		child1.checkMarble(child2);
		
		child1.earnMarble(child2, 2);
		
		child1.checkMarble(child2);
		
		child2.earnMarble(child1, 7);
		
		child1.checkMarble(child2);
	}
}
