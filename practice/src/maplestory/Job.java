package maplestory;

public class Job {
	String weapon;
	String subWeapon;
	String item;
	String jobName;
	
	public Job(String weapon, String subWeapon, String jobName) {
		this.weapon = weapon;
		this.subWeapon = subWeapon;
		this.jobName = jobName;
	}
	public Job(String weapon, String jobName) {
		this.weapon = weapon;
		this.jobName = jobName;
	}
	public Job(String weapon, String subWeapon, String item, String jobName) {
		this.weapon = weapon;
		this.subWeapon = subWeapon;
		this.item = item;
		this.jobName = jobName;
	}
	
	public void skill() {
		System.out.println( this.jobName + "가 " + this.weapon + "을 휘둘렀다.");
	}
	
	public static void main(String[] args) {
		
		Job warrior = new Job("칼", "방패", "전사");
		Job wizard = new Job("지팡이", "마법책", "구슬", "마법사");
		Job archer = new Job("활", "궁수");
		Job thief = new Job("표창", "도적");
		
		warrior.skill();
		wizard.skill();
		archer.skill();
		thief.skill();
	}
}
