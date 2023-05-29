package soandruRPG;

public class HuntingGround {

	public void heroAttack(Monster m, int sum) {
		if (m.monster_defense >= sum) {
			System.out.println(m.monster_name + "의 방어력이 높아 효과가 없었습니다.");
		} else {
			m.monster_hp += m.monster_defense - sum;
			System.out.println("공격을 성공 하였습니다. \n남은 " + m.monster_name + "의 hp는" + m.monster_hp + "입니다.");
		}
	}

	public void monster_attacked(Hero h, int sum) {

		if (h.defense >= sum) {
			h.hp = h.hp - 0;
			System.out.println("방어력이 높아 공격을 무시했습니다.");
		} else {
			h.hp = h.hp + h.defense - sum;
			System.out.println("공격을 당해" + sum + "의 피해를 입었습니다.");
		}
		System.out.println("남은 hp는 " + h.hp + "입니다.");
	}

	public void battle(Hero h, Monster m) {
		while (true) {

			System.out.println(h.name + "의 공격입니다.");
			// m.monster_attacked(h.defense,h.attack());
			heroAttack(m, h.attack());
			if (m.monster_hp <= 0) {

				System.out.println(m.monster_name + "가 죽었습니다.");
				h.experience += m.monster_experience;
				h.money += m.monster_money;
				break;
			}

			System.out.println(m.monster_name + "의 공격입니다.");
//			hero_attacked(m.monster_attack());
			monster_attacked(h, m.monster_attack());
			if (h.hp <= 0) {

				System.out.println(h.name + "이 죽었습니다.");
				h.hp = 1;
				System.out.println(h.name + "이 체력" + h.hp + "으로 부활했습니다.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Mage h = new Mage("nam");
		Monster2 m = new Monster2();
		HuntingGround hunt = new HuntingGround();
		hunt.battle(h, m);

	}
}