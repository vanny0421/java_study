package taxiStop;

public class GyeonggiTaxi implements Taxi {

	int totalMoney;
	int pay;
	int payFuel;
	
	public GyeonggiTaxi(int totalMoney, int pay, int payFuel) {
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
		System.out.println("경기택시 : " + (this.totalMoney - this.payFuel));
	}

}
