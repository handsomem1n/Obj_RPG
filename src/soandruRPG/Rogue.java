package soandruRPG;

public class Rogue extends Hero {
	public Rogue(String name) {
		super(name);
		this.power = 25;
		this.hp = 60;
		this.total_hp = 60;
		this.defense = 15;
		this.mp = 10;
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
			System.out.printf("%s의 토네이도 스핀!!", this.name);
			return (this.level * 15) + (this.power * 30);

		case 3: // 스킬2
			System.out.printf("%s의 베놈 슬래시!!", this.name);
			return (this.level * 20) + (this.power * 50);
		}
	}
}
