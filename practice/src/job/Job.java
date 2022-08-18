package job;

public class Job {
	String weapon;
	String subWeapon;
	String item;
	String jobType;

	public Job(String weapon, String subWeapon, String item, String jobType) {
		this.weapon = weapon;
		this.subWeapon = subWeapon;
		this.item = item;
		this.jobType = jobType;
	}
	
	public Job(String weapon, String subWeapon, String jobType) {
		this.weapon = weapon;
		this.subWeapon = subWeapon;
		this.jobType = jobType;
	}
	
	public Job(String weapon, String jobType) {
		this.weapon = weapon;
		this.jobType = jobType;
	}
	
	public void skill() {
		if (this.jobType == "전사") {
			System.out.println(this.jobType + " : " + this.weapon + "을 가지고 공격했다. "
					+ this.jobType + "는 보조무기로 " + this.subWeapon + "를 가지고 있다.");		
		} else if (this.jobType == "마법사") {			
			System.out.println(this.jobType + " : " + this.weapon + "를 가지고 공격한다. "
					+ this.jobType + "는 보조무기로 " + this.subWeapon + "을 가지고 있으며, " + this.item + " 아이템을 가지고 있다.");
		} else {
			System.out.println(this.jobType + " : " + this.weapon + "을 가지고 공격하고, 보조무기나 아이템은 없다.");						
		}
	}
	
	public static void main(String[] args) {
		
		Job warrior = new Job("칼", "방패", "전사");
		Job archer = new Job("활", "궁수");
		Job wizard = new Job("지팡이", "마법책", "구슬", "마법사");
		Job thief = new Job("표창", "도적");
		
		warrior.skill();
		archer.skill();
		wizard.skill();
		thief.skill();
	}
	
}
