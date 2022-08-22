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
		System.out.println("----타고있는 사람");
		for (int i = 0; i < this.index; i++) {
			if (this.seat[i] != null) {
				System.out.println(this.seat[i].name);
				System.out.println("-------------");
			}
		}
	}

	public void out(Person person) {
		System.out.println("--------내린사람");
		for (int i = 0; i < this.index; i++) {
			if (this.seat[i] != null) {
				if(this.seat[i].name == person.name) {
					System.out.println(this.seat[i].name);
					this.seat[i] = null;
					System.out.println("-------------");
				}				
			}
		}
	}
}
