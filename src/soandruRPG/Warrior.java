package soandruRPG;

public class Warrior extends Hero {
	public Warrior(String name) {
		super(name);
		this.power = 15;
		this.hp = 90;
		this.total_hp = 90;
		this.defense = 30;
		this.mp = 10;
		this.experience = 0;
	}

	public int attack(int skillNum) {
		switch (skillNum) {
		default:
		case 1:
			// 기본 공격
			System.out.printf("%s의 기본 공격\n", this.name);
			return (this.level * 10) + (this.power * 20);

		case 2: // 스킬1
			System.out.printf("%s의 슬래시 블러스트!!\n", this.name);
			return (this.level * 15) + (this.power * 25);

		case 3: // 스킬2
			System.out.printf("%s의 브랜디쉬!!\n", this.name);
			return (this.level * 20) + (this.power * 30);
		}
	}
}
