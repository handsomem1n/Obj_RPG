
public class Monster {
	String name;
	int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;

	Monster(String name, int monser_hp, int monster_defense, int monster_power, int monster_mp, int monster_level,int  monster_experience,int monster_money){
		this.name = name;
		this.monster_hp=monster_hp;
		this.monster_defense=monster_defense;
		this.monster_power=monster_power;
		this.monster_mp=monster_mp;
		this.monster_level=monster_level;
		this.monster_experience=monster_experience;
		this.monster_money=monster_money;
	}
	static int monster_attack() {
		System.out.println("데미지는 " + monster_power + " 입니다.");
		return monster_power;

	}

	static void monster_attacked(int sum) {

		if (hero_defense >= sum) {
			monster_hp = monster_hp - 0;
		} else {
			monster_hp = monster_hp + monster_defense - sum;
		}
	}
}
