package questions;

class TV {
	boolean status = false;
	int channel = 1;
	int volume = 5;
	
	void pushPower(){
		if (status == false) {
			status = true;
			System.out.println("TV ON");
		} else {
			status = false;
			System.out.println("TV OFF");
		}
	}
	
	void channelUp() {
		if (status == true) {
			if (channel != 5) {
				channel++;
				System.out.println("채널 " + channel);
			}
		}
	}
	
	void channelDown() {
		if (status == true) {
			if (channel != 1) {
				channel--;
				System.out.println("채널 " + channel);
			}
		}
	}
	
	void volumeUp() {
		if (status == true) {
			if (volume < 10) {
				volume++;
				System.out.println("볼륨 " + volume);
			}
		}
	}
	
	void volumeDown() {
		if (status == true) {
			if (volume > 1 && volume <= 10) {
				volume--;
				System.out.println("볼륨 " + volume);
			}
		}
	}
}	

public class TVUser {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.pushPower();
		tv.pushPower();
		tv.pushPower();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeDown();
	}
}
