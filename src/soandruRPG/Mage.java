package soandruRPG;

public class Mage extends Hero {
	public Mage(String name) {
		super(name);
		this.power = 20;
		this.hp = 50;
		this.defense = 10;
		this.mp = 30;
		this.experience = 0;
	}

	public int attack(int num) {
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.level * 10) + (this.power * 20);

		case 2: // 스킬1
			System.out.println("파이어 볼");
			return (this.level * 15) + (this.power * 30);

		case 3: // 스킬2
			System.out.println("불기둥");
			return (this.level * 20) + (this.power * 40);
		}
	}
}
