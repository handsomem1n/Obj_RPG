package soandruRPG;

import java.util.Scanner;

public class HuntingGround {

	public void heroAttack(Monster m, int sum) {
		if (m.monster_defense >= sum) {
			System.out.println(m.monster_name + "의 방어력이 높아 효과가 없었습니다.");
		} else {
			m.monster_hp += m.monster_defense - sum;
			System.out.println("\n공격을 성공하였습니다. \n남은 " + m.monster_name + "의 hp는 " + m.monster_hp + "입니다.");
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
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("*********************");
			System.out.println(h.name + "의 공격입니다.");
			// m.monster_attacked(h.defense,h.attack());
			System.out.println("1번: 기본 공격 ");
			System.out.println("2번: 스킬 1 ");
			System.out.println("3번: 스킬 2 ");
			System.out.print("사용하려는 스킬을 선택해주세요. : ");
			int skillNum = sc.nextInt();
			heroAttack(m, h.attack(skillNum));
			if (m.monster_hp <= 0) {
				System.out.println(m.monster_name + "가 죽었습니다.");
				h.experience += m.monster_experience;
				h.money += m.monster_money;
				h.inventory.put(m.item, h.inventory.get(m.item) != null ? h.inventory.get(m.item) + 1 : 0 + 1);
				break;
			}
			System.out.println("*********************");
			System.out.println(m.monster_name + "의 공격입니다.");
//			hero_attacked(m.monster_attack());
			monster_attacked(h, m.monster_attack());
			if (h.hp <= 0) {
				System.out.println(h.name + "이 죽었습니다.");
				h.hp = 1;
				System.out.println(h.name + "이 체력 " + h.hp + "으로 부활했습니다.");
				System.out.println("*********************");
				break;
			}
		}
	}

//	public static void main(String[] args) {
//		Mage h = new Mage("nam");
//		Monster1 m = new Monster1();
//		Monster2 m2 = new Monster2();
//		HuntingGround hunt = new HuntingGround();
//		hunt.battle(h, m);
//
//		// 재료 없을때:{}, 재료 있을때:{재료:수량}
//		// System.out.println(h.inventory);
//	}
}
