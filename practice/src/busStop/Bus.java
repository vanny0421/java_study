package busStop;

public class Bus {

	Person[] seat;
	int index;

	public Bus(Person[] seat, int index) {
		this.seat = seat;
		this.index = index;
	}

	public void in(Person person) {
		seat[index++] = person;
		System.out.println("----탄 사람----");
		for (int i = 0; i < this.index; i++) {
			if(this.seat[i] != null) {
				System.out.println(this.seat[i].name);
			}
		}
	}

	public void out(Person person) {
		System.out.println("----내린사람----");
		for (int i = 0; i < this.index; i++) {
			if (this.seat[i].name == "성구") {
				System.out.println(this.seat[i].name);
				this.seat[i] = null;
			}
		}
		
		
//		for (int i = 0; i < this.index; i++) {
//			if (this.seat[i] != null) {
//				System.out.println(this.seat[i].name);
//			}
//		}
	}

}
