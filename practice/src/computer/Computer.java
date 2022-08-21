package computer;

public class Computer {
//	int diskStorage;
//	
//	Chrome chrome = new Chrome();
//	Discord discord = new Discord();
//	KakaoTalk kakao = new KakaoTalk();
//	Safari safari = new Safari();
//	
//	public Computer(int diskStorage) {
//		this.diskStorage = diskStorage;
//	}
//	
//	public void downLoad(Program program) {
//		
//		int totStorage = this.diskStorage;
//		int discordV = this.discord.needStorage;
//		int kakaoV = this.kakao.needStorage;
//		
//		System.out.println("다운로드 전 남은 용량 : " + totStorage);
//		System.out.println("디스코드 설치중..");
//		System.out.println("카카오톡 설치중...");
//		System.out.println("다운로드 후 남은 용량 : " + (totStorage-(discordV + kakaoV)));
	
	int diskStorage;

	public Computer(int diskStorage) {
		this.diskStorage = diskStorage;
	}

	void downLoad(Program program) {

		if (program instanceof KakaoTalk) {

			if (this.diskStorage >= ((KakaoTalk) program).needStorage) {

				System.out.println("원래 용량 :" + this.diskStorage);

				this.diskStorage = this.diskStorage - ((KakaoTalk) program).needStorage;

				System.out.println("설치 후 남은 용량 :" + this.diskStorage);

			} else {
				System.out.println("남은 용량이 부족합니다.");
			}
		} else if (program instanceof Discord) {

			if (this.diskStorage >= ((Discord) program).needStorage) {

				System.out.println("원래 용량 :" + this.diskStorage);

				this.diskStorage = this.diskStorage - ((Discord) program).needStorage;

				System.out.println("설치 후 남은 용량 :" + this.diskStorage);

			} else {
				System.out.println("남은 용량이 부족합니다.");
			}

		} else if (program instanceof Safari) {

			if (this.diskStorage >= ((Safari) program).needStorage) {

				System.out.println("원래 용량 :" + this.diskStorage);

				this.diskStorage = this.diskStorage - ((Safari) program).needStorage;

				System.out.println("설치 후 남은 용량 :" + this.diskStorage);

			} else {
				System.out.println("남은 용량이 부족합니다.");
			}

		} else if (program instanceof Chrome) {

			if (this.diskStorage >= ((Chrome) program).needStorage) {

				System.out.println("원래 용량 :" + this.diskStorage);

				this.diskStorage = this.diskStorage - ((Chrome) program).needStorage;

				System.out.println("설치 후 남은 용량 :" + this.diskStorage);

			} else {
				System.out.println("남은 용량이 부족합니다.");
			}

		}

	}
}
