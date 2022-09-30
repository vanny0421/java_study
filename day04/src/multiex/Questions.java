package multiex;

public class Questions {
	
	public static void main(String[] args) {
		
		Operation[] opArr = new Operation[10];
		
		opArr[0] = new Q1();	
		opArr[1] = new Q2();
		opArr[2] = new Q3();
		opArr[3] = new Q4();
		opArr[4] = new Q5();
		opArr[5] = new Q6();
		opArr[6] = new Q7();
		opArr[7] = new Q8();
		opArr[8] = new Q9();
		opArr[9] = new Q10();
		
		for(int i=0;i<opArr.length;i++) {
			//opArr[i] = new Q1();
			opArr[i].oper();
			System.out.println("--------------------------------");
		}
	}
}
