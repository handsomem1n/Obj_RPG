package soandruRPG;

public class OperatorHero extends Hero {
	public OperatorHero(String name) {
		super(name);
		this.power = 99999;
		this.hp = 99999;
		this.total_hp = 99999;
		this.defense = 99999;
		this.mp = 99999;
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
			System.out.printf("%s의 운영자의 내려치기!!", this.name);
			return (this.level * 15) + (this.power * 30);

		case 3: // 스킬2
			System.out.printf("%s의 운영자의 올려치기!!", this.name);
			return (this.level * 20) + (this.power * 40);
		}
	}
}
