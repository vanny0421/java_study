package school;

public class KoreaITAcademy {

	public static void main(String[] args) {
		
		Student aron = new Student();
		Student aronP = new Student();
		Student aronPa = new Student();
		Student aronPar = new Student();
		Student aronPark = new Student();
		
		Academy academy = new Academy();
		
		System.out.println(aron.attendance(academy));
		System.out.println(aronP.attendance(academy));
		System.out.println(aronPa.attendance(academy));
		System.out.println(aronPar.attendance(academy));
		System.out.println(aronPark.attendance(academy));
		
		System.out.println(aron.exit(academy));
		System.out.println(aronP.exit(academy));
	}
}
