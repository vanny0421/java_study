package school;

public class KoreaITAcademy {

	public static void main(String[] args) {
		
		Academy academy = new Academy();
		
		Student aron = new Student();
		Student aronP = new Student();
		Student aronPa = new Student();
		Student aronPar = new Student();
		Student aronPark = new Student();
		
		
		System.out.println(aron.attendance(academy));
		System.out.println(aronP.attendance(academy));
		System.out.println(aronPa.attendance(academy));
		System.out.println(aronPar.attendance(academy));
		System.out.println(aronPark.attendance(academy));
		
		System.out.println(aronPar.exit(academy));
		System.out.println(aronPark.exit(academy));
	}
}
