package game;

public class MGPApp {

	public static void main(String[] args) {
		
		Player[] players = new Player[2];
		Game game = new Game(players);
		
		game.run();
	}
}
