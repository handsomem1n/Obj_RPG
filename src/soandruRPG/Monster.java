package soandruRPG;

public class Monster {
	String monster_name, item;
	int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;

	public int monster_attack() {
		return monster_power;

	}

//	public void monster_attacked(int hero_defense, int sum) {
//
//		if (hero_defense >= sum) {
//			monster_hp = monster_hp - 0;
//		} else {
//			monster_hp = monster_hp + monster_defense - sum;
//		}
//	}
}

class Monster1 extends Monster {
	public Monster1() {
		monster_name = "타락한 들쥐";
		monster_hp = 100;
		monster_defense = 5;
		monster_power = 20;
		monster_mp = 0;
		monster_level = 1;
		monster_experience = 10;
		monster_money = 10;
		item = "들쥐의 꼬리";
	}
}

class Training_Monster1 extends Monster {
	public Training_Monster1() {
		monster_name = "강화된 타락한 들쥐";
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
		monster_name = "타락한 불독";
		monster_hp = 2000;
		monster_defense = 20;
		monster_power = 100;
		monster_mp = 0;
		monster_level = 5;
		monster_experience = 50;
		monster_money = 30;
		item = "불독의 뼈";
	}
}

class Training_Monster2 extends Monster {
	public Training_Monster2() {
		monster_name = "강화된 타락한 불독";
		monster_hp = 3000;
		monster_defense = 35;
		monster_power = 150;
		monster_mp = 0;
		monster_level = 7;
		monster_experience = 65;
	}
}

class Monster3 extends Monster {
	public Monster3() {
		monster_name = "타락한 늑대";
		monster_hp = 3000;
		monster_defense = 30;
		monster_power = 200;
		monster_mp = 0;
		monster_level = 8;
		monster_experience = 100;
		monster_money = 50;
		item = "늑대의 고기";
	}
}

class Training_Monster3 extends Monster {
	public Training_Monster3() {
		monster_name = "강화된 타락한대늑대";
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
		monster_name = "타락한 곰";
		monster_hp = 5000;
		monster_defense = 50;
		monster_power = 300;
		monster_mp = 0;
		monster_level = 13;
		monster_experience = 200;
		monster_money = 80;
		item = "곰의 앞발";
	}
}

class Training_Monster4 extends Monster {
	public Training_Monster4() {
		monster_name = "강화된 타락";
		monster_hp = 6500;
		monster_defense = 65;
		monster_power = 450;
		monster_mp = 0;
		monster_level = 18;
		monster_experience = 300;
	}
}
