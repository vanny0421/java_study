package restaurant;

public class ChineseRestaurantEmployee implements Employee {

	@Override
	public void serving(String[] shelf) {
		
		int shelfIndex = 0;
		
		for(int i=0;i<shelf.length;i++) {
			
			if (shelf[i] == null) {
				
				shelfIndex = i - 1;
				break;
			}
		}
		
		if (shelf[shelfIndex].equals("짜장면") || shelf[shelfIndex].equals("짬뽕") || shelf[shelfIndex].equals("볶음밥")) {
			
			System.out.println("\n[ 중국식당 ]\n\n중국직원이 \'" + shelf[shelfIndex] + "\' 을 서빙합니다.\n");
			
			shelf[shelfIndex] = null;
		} else {
			System.out.println("\n[ 중국식당 ]\n\n\'" + shelf[shelfIndex] + "\' 은 우리가게 음식이 아닙니다.\n");

		}
	}

	@Override
	public void getOrder(String[] shelf, String food) {
//		int i=0;
//		
//		if (food.equals("짜장면") || food.equals("짬뽕") || food.equals("볶음밥")) {
//			shelf[i++] = food;
//			System.out.println(food);
//		} else {
//			System.out.println("\n[ 중국식당 ]\n\n중국직원 : 죄송합니다. " + food + "은 팔지 않습니다.\n");
//		}
	}
}
