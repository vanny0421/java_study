package restaurant;

public class KoreanRestaurantEmployee implements Employee { 

	@Override
	public void serving(String[] shelf) {
		
		int shelfIndex = 0;
		
		for(int i=0;i<shelf.length;i++) {
			
			if (shelf[i] == null) {
				
				shelfIndex = i - 1;
				
				break;
			}
		}
		
		if (shelf[shelfIndex].equals("오이무침") || shelf[shelfIndex].equals("백숙") || shelf[shelfIndex].equals("김치전") || 
			shelf[shelfIndex].equals("죽") || shelf[shelfIndex].equals("호박식혜")) {
			
			System.out.println("\n[ 한국식당 ]\n\n한국직원이 \'" + shelf[shelfIndex] + "\' 을 서빙합니다.\n");
			
			shelf[shelfIndex] = null;
		} else {
			System.out.println("\n[ 한국식당 ]\n\n\'" + shelf[shelfIndex] + "\' 은 우리가게 음식이 아닙니다.\n");

		}
	}

	@Override
	public void getOrder(String[] shelf, String food) {
//		int i=0;
//		
//		if (food.equals("오이무침") || food.equals("백숙") || food.equals("김치전") || food.equals("죽") || food.equals("호박식혜")) {
//			shelf[i++] = food;
//			System.out.println(food);
//		} else {
//			System.out.println("\n[ 한국식당 ]\n\n한국직원 : 죄송합니다. " + food + "은 팔지 않습니다.\n");
//		}
	}
}
