package restaurant;

public class MainRestaurant {

	public static void main(String[] args) {
		
//		String[] chineseRecipe = new String[3];
		
		ChineseCook chineseCook = new ChineseCook(new String[]{"짜장면","짬뽕","볶음밥"});
		
//		String[] koreanRecipe = new String[5];
		
		KoreanCook koreanCook = new KoreanCook(new String[]{"오이무침","백숙","김치전","죽","호박식혜"});
		
//		chineseRecipe[0] = "짜장면";
//		chineseRecipe[1] = "짬뽕";
//		chineseRecipe[2] = "볶음밥";
//		
//		koreanRecipe[0] = "오이무침";
//		koreanRecipe[1] = "백숙";
//		koreanRecipe[2] = "김치전";
//		koreanRecipe[3] = "죽";
//		koreanRecipe[4] = "호박식혜";
		
		String[] shelf = new String[10];
		
		ChineseRestaurantEmployee chineseEmployee = new ChineseRestaurantEmployee();
		KoreanRestaurantEmployee koreanEmployee = new KoreanRestaurantEmployee();
		
		chineseCook.cook("짜장면", shelf);
		chineseCook.cook("짬뽕", shelf);
		chineseCook.cook("짜장면", shelf);
		chineseCook.cook("탕수육", shelf);
		
		chineseCook.printOrderList(shelf);
		
		koreanCook.cook("오이무침", shelf);
		koreanCook.cook("김치전", shelf);
		koreanCook.cook("죽", shelf);
		koreanCook.cook("팥죽", shelf);
		
		koreanCook.printOrderList(shelf);

		chineseEmployee.serving(shelf);
		koreanEmployee.serving(shelf);
		chineseEmployee.serving(shelf);
		koreanEmployee.serving(shelf);
		chineseEmployee.serving(shelf);
		koreanEmployee.serving(shelf);
		chineseEmployee.serving(shelf);
		koreanEmployee.serving(shelf);
		chineseEmployee.serving(shelf);
		
	}
}
