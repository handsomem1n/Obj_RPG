package soandruRPG;

public class Hero {
	String name;
	int level;
	int power;
	int total_hp;
	int hp;
	int defense;
	int mp;
	int total_mp;
	int experience;
	int money;
	int needToLevelUp;

	public Hero(String name) {
		this.name = name;
		this.level = 1; // 초기 레벨
		this.money = 0; // 초기 보유금액
		this.needToLevelUp = 100;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDefense() {
		return this.defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	int attack(int num) {
		return 0
	public int getNeedToLevelUp() {
		return this.needToLevelUp;
	}

	public void setNeedToLevelUp(int needToLevelUp) {
		this.needToLevelUp = needToLevelUp;

	}

	public void gainExperience(int exp) {
		this.experience += exp;

		// 경험치가 레벨업에 필요한 경험치 이상이면 레벨업
		if (this.experience >= this.needToLevelUp) {
			levelUp();
		}
	}
	
	// level up 메서드
	private void levelUp() {
		this.level++;
		this.power += 3;
		this.defense += 3;
		this.total_hp += 10;
		this.total_mp += 10;
		System.out.println("레벨업!!");
		System.out.println("축하합니다! 레벨이 " + this.level + "로 올랐습니다.");
        System.out.println("레벨업을 하여 영웅의 능력치가 상승하였습니다!!");
        
		
		// 레벨업에 필요한 경험치 증가 로직
		// 예를 들어, 다음 레벨업에 필요한 경험치를 현재 레벨의 2배로 설정
		this.needToLevelUp = this.level * 2;

		// 레벨업 후, 레벨업에 필요했던 경험치를 경험치에서 빼기
		this.experience -= this.needToLevelUp;
		
		showStatus(); //스텟보여주는 메서드 호출
	}
	    public void showStatus() {
	        System.out.println("------ 영웅의 상태 ------");
	        System.out.println("이름: " + this.name);
	        System.out.println("레벨: " + this.level);
	        System.out.println("HP: " + this.total_hp);
	        System.out.println("Power: " + this.power);
	        System.out.println("Defense: " + this.defense);
	        System.out.println("MP: " + this.total_mp);
	        System.out.println("경험치: " + this.experience);
	        System.out.println("다음 레벨업까지 필요한 경험치: " + this.needToLevelUp);
	    }
	public int attack (int skillNum) {
		return 0;
	}
	void attacked(int sum) {
		if (defense >= sum) {
			// 체력변화 x
		} else {
			hp = hp + defense - sum;
			if (hp < 0) { // hp 0이하 방지
				hp = 0;
			}
		}
	}
}
