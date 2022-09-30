package game;

import java.util.Scanner;

public class Game {

	Player[] players;

	public Game(Player[] players) {
		this.players = players;
	}
	
	void run() {
	
		System.out.println("묵찌빠 게임을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		
		players = new Player[2];
		System.out.print("선수이름 입력 >>");
		String owner = sc.next();
		players[0] = new Human(owner);
		
		System.out.print("컴퓨터이름 입력 >>");
		String computer = sc.next();
		players[1] = new Computer(computer);
		
		System.out.println(players.length + "명의 선수를 생성 완료하였습니다.\n");
	
		String input;
		System.out.print(owner + ">>");
		
		input = sc.next();
		
		int random = (int) Math.floor(Math.random() * 3);
		
		while (true) {
			for(int i=0; i<players.length; i++) {
				if (players[0].bet[i].equals(input)) {
					System.out.println(computer + ">> 결정하였습니다.");
				} 
			}
			System.out.println(owner + " : " + input + ", " + computer + " : " + players[1].bet[random] + "\n");
			
			if (input.equals(players[1].bet[random])) {
				System.out.println(owner + "이 이겼습니다.");
				System.out.println("게임을 종료합니다.\n");
				break;
				
			} else {
				System.out.println("묵, 찌, 빠 중에서 입력하세요");
				input = sc.next();
				continue;
			}
		}
	}
}
