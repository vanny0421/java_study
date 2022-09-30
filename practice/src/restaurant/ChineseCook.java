package restaurant;

public class ChineseCook implements Cook {

	String[] recipe;
	
	public ChineseCook(String[] recipe) {
		super();
		this.recipe = recipe;
	}
	
	@Override
	public void cook(String food, String[] shelf) {
		
		int shelfIndex = 0;
		
		for(int i=0;i<shelf.length;i++) {
			if(shelf[i] == null || shelf[i].isEmpty()) {
				shelfIndex = i;
				break;
			}
		}
		
		boolean flag = false;
		
		for(int i=0;i<this.recipe.length;i++) {
			if (this.recipe[i].equals(food)) {
				flag = true;
				break;
			} 
		}
		
		if (flag) {
			shelf[shelfIndex] = food;
		} else {
			System.out.println("\n[ 중국식당 ]\n\n\'" + food + "\' 은 우리가게에서 판매하지 않는 요리입니다.\n");
		}
	}
	
	public void printOrderList(String[] shelf) {
		
		for(int i=0;i<shelf.length;i++) {
			if (shelf[i] == null) {
				
			} else {
				System.out.println((i+1) + "번째 " + "선반에 있는 요리 : " + shelf[i] + "\n");
			}
		}
	}
}
