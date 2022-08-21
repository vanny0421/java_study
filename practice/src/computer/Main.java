package computer;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer(32);
	      
	      KakaoTalk kakaotalk = new KakaoTalk();
	      Safari safari = new Safari();
	      Discord discord = new Discord();
	      Chrome chrome = new Chrome();
	      
	      computer.downLoad(kakaotalk);
	      computer.downLoad(safari);
	      computer.downLoad(discord);
	      computer.downLoad(chrome);
	}
}
