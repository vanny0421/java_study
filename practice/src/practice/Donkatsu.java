package practice;

class SirloinDonkatsu {
	String fried;
	String meat;
	String flavor;
	int price;
}

class TenderLoinDonkatsu {
	SirloinDonkatsu sd;
	public TenderLoinDonkatsu (SirloinDonkatsu sd) {
		this.sd = sd;
	}
}

class HalfHalfDonkatsu {
	SirloinDonkatsu sd;
	TenderLoinDonkatsu td;
	public HalfHalfDonkatsu (SirloinDonkatsu sd) {
		this.sd = sd;
	}
}

class CheeseDonkatsu {
	SirloinDonkatsu sd;
	public CheeseDonkatsu (SirloinDonkatsu sd) {
		this.sd = sd;
	}
}

public class Donkatsu {
	public static void main(String[] args) {
		
		
		SirloinDonkatsu sd = new SirloinDonkatsu();
		
		sd.fried = "튀김";
		sd.meat = "등심";
		sd.flavor = "등심돈카츠";
		sd.price = 11000;
		
		TenderLoinDonkatsu td = new TenderLoinDonkatsu(sd);
		
		td.sd.meat = "특안심";
		td.sd.flavor = "특안심돈카츠";
		td.sd.price = 13000;
		
		HalfHalfDonkatsu hhd = new HalfHalfDonkatsu(sd);
		
		sd.meat = "등심, 특안심";
		sd.flavor = "반반돈카츠";
		sd.price = 14000;
		
		CheeseDonkatsu cd = new CheeseDonkatsu(sd);
		
		sd.flavor = "치즈돈카츠";
		sd.price = 13500;
		
	}
	
}
