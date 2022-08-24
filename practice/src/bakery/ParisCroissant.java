package bakery;

public class ParisCroissant implements BakeryFactory {

	Bread[] breadStand;
	int index;
	
	public ParisCroissant(Bread[] pcBreadStand, int index) {
		super();
		this.breadStand = pcBreadStand;
		this.index = index;
	}

	@Override
	public void makeBread(Bread bread) {
		breadStand[index++] = bread;
	}
	
	public void checkBreadStand(Bread[] pcBreadStand) {
		System.out.println("　🍞🥐🥨파리크라상🥯🥖🫓\n");
		if (index == 0) {
			System.out.println("　　빵이 없습니다 ㅠㅠ\n");
		} else {
			for (int i = 0; i < this.index; i++) {
					System.out.println("　　　" + breadStand[i].bread);					
			}
		}
		System.out.println();
	}

	@Override
	public void sellBread(Bread bread) {
		System.out.println("　파리크라상 " + bread.bread + "이 " + bread.breadPrice + "원에 팔렸습니다.\n");
		for(int i=0;i<this.index;i++) {
			index--;
		}
	}
}
