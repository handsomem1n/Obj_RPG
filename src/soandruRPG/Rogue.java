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

	public int attack(int num) {
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.level * 10) + (this.power * 20);

		case 2: // 스킬1
			System.out.println("토네이도 스핀");
			return (this.level * 15) + (this.power * 30);

		case 3: // 스킬2
			System.out.println("베놈 슬래시");
			return (this.level * 20) + (this.power * 50);
		}

	}

}
