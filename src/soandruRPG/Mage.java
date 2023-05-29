package soandruRPG;

public class Mage extends Hero {
	public Mage(String name) {
		super(name);
		this.power = 20;
		this.hp = 50;
		this.total_hp = 50;
		this.defense = 10;
		this.mp = 30;
		this.experience = 0;
	}

	public int attack(int skillNum) {
		switch (skillNum) {
		default:
		case 1:
			// 기본 공격
			System.out.printf("%s의 기본 공격!", this.name);
			return (this.level * 10) + (this.power * 20);

		case 2: // 스킬1
			System.out.printf("%s의 파이어 볼!!", this.name);
			return (this.level * 15) + (this.power * 30);

		case 3: // 스킬2
			System.out.printf("%s의 불기둥!!", this.name);
			return (this.level * 20) + (this.power * 40);
		}
	}
}
