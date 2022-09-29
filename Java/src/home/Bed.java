package home;

public class Bed {

	Person[] person;
	String manufacturingCompany;
	int price;
	
	public Bed(Person[] person, String manufacturingCompany, int price) {
		super();
		this.person = person;
		this.manufacturingCompany = manufacturingCompany;
		this.price = price;
	}

	public void lieDown(Person person) {
		int cnt = 0;
		int weight = 0;
		int tot = 0;
		int maxWeight = 150;
		
		boolean check = false;
		
		this.person[cnt++] = person;
		
		for(int i=0; i<this.person.length; i++) {
			if (this.person[i] != null) {
				weight = this.person[i].weight;
				check = true;
				break;
			}
		}
		
		if(check == true) {
			if(weight < maxWeight) {
				System.out.println("weight : " + weight);
				tot = (maxWeight - weight);
				System.out.println(tot);
			}
			if(person.height > 170 || weight > maxWeight) {
				System.out.println("침대가 무게(키)를 버틸수 없습니다.");
			}
		}
	}
}
