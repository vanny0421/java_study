package taxiStop;

public class BusanTaxi implements Taxi {

	int totalMoney;
	int pay;
	int payFuel;
	
	public BusanTaxi(int totalMoney, int pay, int payFuel) {
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
		System.out.println("부산택시 : " + (this.totalMoney - this.payFuel));
	}

}
