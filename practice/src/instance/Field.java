package instance;

interface Job {

}

class Warrior implements Job {
	String weapon;
	String subWeapon;
	String jobType;

	public Warrior(String weapon, String subWeapon, String jobType) {
		this.weapon = weapon;
		this.subWeapon = subWeapon;
		this.jobType = jobType;
	}

}

class Archer implements Job {
	String weapon;
	String jobType;

	public Archer(String weapon, String jobType) {
		this.weapon = weapon;
		this.jobType = jobType;
	}

}

class Wizard implements Job {
	String weapon;
	String subWeapon;
	String item;
	String jobType;

	public Wizard(String weapon, String subWeapon, String item, String jobType) {
		this.weapon = weapon;
		this.subWeapon = subWeapon;
		this.item = item;
		this.jobType = jobType;
	}

}

class Thief implements Job {
	String weapon;
	String jobType;

	public Thief(String weapon, String jobType) {
		this.weapon = weapon;
		this.jobType = jobType;
	}

}

public class Field {

	void logRemains(Job job) {
		// 이곳을 채우시오 ( instanceof 를 꼭 써야함 )
		if (job instanceof Warrior) {
			System.out.println(((Warrior) job).jobType + " : " + ((Warrior) job).weapon + "을 가지고 공격했다. "
					+ ((Warrior) job).jobType + "는 보조무기로 " + ((Warrior) job).subWeapon + "를 가지고 있다.");
		} else if (job instanceof Wizard) {
			System.out.println(((Wizard) job).jobType + " : " + ((Wizard) job).weapon + "를 가지고 공격한다. "
					+ ((Wizard) job).jobType + "는 보조무기로 " + ((Wizard) job).subWeapon + "을 가지고 있으며, "
					+ ((Wizard) job).item + " 아이템을 가지고 있다.");
		} else if (job instanceof Archer) {
			System.out.println(((Archer) job).jobType + " : " + ((Archer) job).weapon + "을 가지고 공격하고, 보조무기나 아이템은 없다.");
		} else if (job instanceof Thief) {
			System.out.println(((Thief) job).jobType + " : " + ((Thief) job).weapon + "을 가지고 공격하고, 보조무기나 아이템은 없다.");
		}
	}

	public static void main(String[] args) {

		// 철수는 게임회사에 재직중이다
		// 요즘들어 버그사용유저가 늘어나서 게임회사의 입장에선
		// 게임을 즐기는 유저들의 정확한 활동내역을 하나하나 감시해야하는 상황이다
		// 물약을 먹고 이동을하고 퀘스트를 수행하는 모든 활동들 중에 가장 중요한것은
		// 자동으로 사냥을 해서 레벨업을 하고, 게임머니를 현금으로 판매하는 악성
		// 유저들의 문제가 가장 크다

		// 유저들의 공격 이벤트가 발생할때마다 게임회사의 콘솔에 로그로 기록이 되어야한다
		// 필드에서 일어나는 공격 이벤트를 로그로 기록이 되게 만들어라

		Job warrior = new Warrior("칼", "방패", "전사");
		Job archer = new Archer("활", "궁수");
		Job wizard = new Wizard("지팡이", "마법책", "구슬", "마법사");
		Job thief = new Thief("표창", "도적");

		Field field = new Field();
		field.logRemains(warrior);
		field.logRemains(archer);
		field.logRemains(wizard);
		field.logRemains(thief);

	}
}