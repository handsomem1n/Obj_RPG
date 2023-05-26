package soandruRPG;
public class HuntingGround {

	public void heroAttack(Monster m, int sum) {
		if (m.monster_defense >= sum) {
			System.out.println(m.monster_name + "의 방어력이 높아 효과가 없었습니다.");
		} else {
			m.monster_hp += m.monster_defense - sum;
			System.out.println("공격을 성공 하였습니다. 남은" + m.monster_name + "의 hp는" + m.monster_hp + "입니다.");
		}
	}

	public void monster_attacked(Hero h, int sum) {

		if (h.hero_defens= >= sum) {
			h.hero_hp = h.hero_hp - 0;
		} else {
			h.hero_hp = h.hero_hp + h.hero_defense - sum;
		}
	}
}
