package soandruRPG;

public class Monster {
	String monster_name, item;
	int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;

	public int monster_attack() {
		return monster_power;

	}

	public void monster_attacked(int hero_defense, int sum) {

		if (hero_defense >= sum) {
			monster_hp = monster_hp - 0;
		} else {
			monster_hp = monster_hp + monster_defense - sum;
		}
	}
}

class Monster1 extends Monster {
	public Monster1() {
		monster_name = "너구리";
		monster_hp = 100;
		monster_defense = 5;
		monster_power = 20;
		monster_mp = 0;
		monster_level = 1;
		monster_experience = 10;
		monster_money = 10;
		item = "너구리의 꼬리";
	}
}

class Training_Monster1 extends Monster {
	public Training_Monster1() {
		monster_name = "강화된 너구리";
		monster_hp = 150;
		monster_defense = 7;
		monster_power = 30;
		monster_mp = 0;
		monster_level = 2;
		monster_experience = 15;
	}
}

class Monster2 extends Monster {
	public Monster2() {
		monster_name = "살쾡이";
		monster_hp = 2000;
		monster_defense = 20;
		monster_power = 100;
		monster_mp = 0;
		monster_level = 5;
		monster_experience = 50;
		monster_money = 30;
	}
}

class Training_Monster2 extends Monster {
	public Training_Monster2() {
		monster_name = "강화된 살쾡이";
		monster_hp = 3000;
		monster_defense = 35;
		monster_power = 150;
		monster_mp = 0;
		monster_level = 7;
		monster_experience = 65;
		item = "살쾡이의 살코기";
	}
}

class Monster3 extends Monster {
	public Monster3() {
		monster_name = "리본 돼지";
		monster_hp = 3000;
		monster_defense = 30;
		monster_power = 200;
		monster_mp = 0;
		monster_level = 8;
		monster_experience = 100;
		monster_money = 50;
		item = "리본돼지의 삼겹살";
	}
}

class Training_Monster3 extends Monster {
	public Training_Monster3() {
		monster_name = "강화된 리본 돼지";
		monster_hp = 4500;
		monster_defense = 45;
		monster_power = 300;
		monster_mp = 0;
		monster_level = 12;
		monster_experience = 150;
	}
}

class Monster4 extends Monster {
	public Monster4() {
		monster_name = "슬라임";
		monster_hp = 5000;
		monster_defense = 50;
		monster_power = 300;
		monster_mp = 0;
		monster_level = 13;
		monster_experience = 200;
		monster_money = 80;
		item = "슬라임의 슬라임";
	}
}

class Training_Monster4 extends Monster {
	public Training_Monster4() {
		monster_name = "강화된 슬라임";
		monster_hp = 6500;
		monster_defense = 65;
		monster_power = 450;
		monster_mp = 0;
		monster_level = 18;
		monster_experience = 300;
	}
}

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
}
