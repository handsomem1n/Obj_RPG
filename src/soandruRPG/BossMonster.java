package soandruRPG;

import java.util.Random;

class BossMonster extends Monster {
	public BossMonster() {
		monster_name = "사자왕";
		monster_hp = 15000;
		monster_defense = 200;
		monster_power = 1000;
		monster_mp = 0;
		monster_level = 25;
		monster_experience = 500;
		monster_money = 1000;
	}

	public int monster_attack() {
		Random random = new Random();
		int num = random.nextInt(3);
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.monster_level * 10) + (this.monster_power * 20);

		case 2: // 스킬1
			System.out.println("포효소리");
			return (this.monster_level * 15) + (this.monster_power * 30);

		case 3: // 스킬2
			System.out.println("할퀴기");
			return (this.monster_level * 20) + (this.monster_power * 40);
		}
	}

	public static void main(String[] args) {
		Mage h = new Mage("nam");
		Monster1 m = new Monster1();
		BossMonster m2 = new BossMonster();
		HuntingGround hunt = new HuntingGround();
		hunt.battle(h, m2);

		// 재료 없을때:{}, 재료 있을때:{재료:수량}
		// System.out.println(h.inventory);
	}

}
