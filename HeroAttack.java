// 히어로 어택 클래스를 따로 만들려고 했는데 이미 hero 클래스에서 공격과 사용을 만드신 것같아 일단 코드만 올려보겠습니다.
public class HeroAttack {
	private int skill;
	
	public int heroSkillDamage(int skillNum) {
		if(skillNum == 1) {
			if(hero_mp>=5) {
				int sum = hero_level*10+ hero_power*30;
				hero_mp-=5;
				return sum;
			}else {
				System.out.println("mp가 부족하여 기본공격이 나갑니다.");
				int sum = hero_level*5*hero_power*10;
				return sum;
			}
		}else if(skill == 2) {
			if(hero_mp>=10) {
				int sum = hero_level*10+ hero_power*40;
				hero_mp-=10;
				return sum;
			}else {
				System.out.println("mp가 부족하여 기본공격이 나갑니다.");
				int sum = hero_level*5*hero_power*10;
				return sum;
			}
		}else {
			int sum = hero_level * 5 + hero_power*10;
			return sum;
		}
	}
	public void heroAttack(int sum) {
		if(monster_defense >= sum) {
			System.out.println(monster_name+"의 방어력이 높아 효과가 없었습니다.");
		}else{
			monster_hp +=monster_defense -sum;
			System.out.println("공격을 성공 하였습니다. 남은" + monster_name+"의 hp는"+monster_hp+"입니다.");
		}
	}
}
