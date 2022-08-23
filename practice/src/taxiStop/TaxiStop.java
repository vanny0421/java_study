package taxiStop;

public class TaxiStop {

	public static void main(String[] args) {

		BusanTaxi busanTaxi = new BusanTaxi(0, 4000, 30000);
		SeoulTaxi seoulTaxi = new SeoulTaxi(0, 3000, 12000);
		GyeonggiTaxi gyeonggiTaxi = new GyeonggiTaxi(0, 2500, 20000);

		for (int i = 0; i < 2; i++) {
			seoulTaxi.takePerson();
		}

		for (int i = 0; i < 3; i++) {
			gyeonggiTaxi.takePerson();
		}

		int i = 0;

		while (i < 17) {
			busanTaxi.takePerson();
			i++;
		}
		
		busanTaxi.finishJob();
		seoulTaxi.finishJob();
		gyeonggiTaxi.finishJob();
	}
}
