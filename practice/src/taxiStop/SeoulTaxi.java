package taxiStop;

public class SeoulTaxi implements Taxi {

	int totalMoney;
	int pay;
	int payFuel;
	
		
	public SeoulTaxi(int totalMoney, int pay, int payFuel) {
		super();
		this.totalMoney = totalMoney;
		this.pay = pay;
		this.payFuel = payFuel;
	}

	@Override
	public void takePerson() {
		this.totalMoney += this.pay;
	}

	@Override
	public void finishJob() {
		System.out.println("서울택시 : " + (this.totalMoney - this.payFuel));
	}

}
