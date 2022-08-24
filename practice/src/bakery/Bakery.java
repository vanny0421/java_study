package bakery;

public class Bakery {

	public static void main(String[] args) {
		
		Bread[] breadStand = new Bread[20];
		Bread[] tjBreadStand = new Bread[20];
		Bread[] pcBreadStand = new Bread[10];
		
		ParisBaguette paba = new ParisBaguette(breadStand, 0);

		TOUSlesJOURS tj = new TOUSlesJOURS(tjBreadStand, 0);
		
		ParisCroissant pc = new ParisCroissant(pcBreadStand, 0);
		
		Bread soboroBread = new Bread("소보로빵", 2500);
		Bread redbeanBread = new Bread("팥빵", 1000);
		Bread wheatBread = new Bread("호밀빵", 1500);

		paba.makeBread(soboroBread);
		paba.makeBread(redbeanBread);
		paba.makeBread(wheatBread);
		
		paba.checkBreadStand(breadStand);

		Bread pizzaBread = new Bread("피자빵", 3000);
		Bread strawberryJamBread = new Bread("딸기잼빵", 1500);
		Bread whiteBread = new Bread("식빵", 2000);
		Bread tjbread = new Bread("빵", 500);
		Bread saltBread = new Bread("소금빵", 3500);
		
		tj.makeBread(pizzaBread);
		tj.makeBread(strawberryJamBread);
		tj.makeBread(whiteBread);
		tj.makeBread(tjbread);
		tj.makeBread(saltBread);
		
		tj.checkBreadStand(breadStand);
		
		Bread redBeanbread = new Bread("팥빵", 2500);
		
		pc.makeBread(redBeanbread);
		
		pc.checkBreadStand(breadStand);
		
		paba.sellBread(redbeanBread);
		
		paba.checkBreadStand(breadStand);
		
		tj.sellBread(saltBread);
		
		tj.checkBreadStand(tjBreadStand);
		
		pc.sellBread(redBeanbread);
		
		pc.checkBreadStand(pcBreadStand);
	}
}
