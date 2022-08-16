package toy;

public class Toy {
	
	String mfCompany;
	String manufactureDate;
	int ageOfUse;
	int price;
	
	public Toy(String mfCompany, String manufatureDate, int ageOfUse) {
		this.mfCompany = mfCompany;
		this.manufactureDate = manufatureDate;
		this.ageOfUse = ageOfUse;
	}
	
	public Toy(int price) {
		this.price = price;
	}
}
