package soandruRPG;

import java.util.HashMap;

public class Hero {
	String name;
	int level;
	int power;
	int hp;
	int defense;
	int mp;
	int experience;
	int money;
	public HashMap<String, Integer> inventory = new HashMap<>();

	public Hero(String name) {
		this.name = name;
		this.level = 1; // 초기 레벨
		this.money = 0; // 초기 보유금액
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
		return level * 10 + power * 20;
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
//생성자
//직업 H = new 직업();
//H.hp = 

// 직업 클래스

//public class Warrior extends Hero {
//    public Warrior(String name) {
//        super(name);
//        this.power = 15;
//        this.hp = 90;
//        this.defense = 30;
//        this.mp = 10;
//        this.experience = 0;
//    }
//}

//public class Mage extends Hero {
//    public Mage(String name) {
//        super(name);
//        this.power = 20;
//        this.hp = 50;
//        this.defense = 10;
//        this.mp = 30;
//        this.experience = 0;
//    }
//}

//public class Rogue extends Hero {
//    public Rogue(String name) {
//        super(name);
//        this.power = 25;
//        this.hp = 60;
//        this.defense = 15;
//        this.mp = 10;
//        this.experience = 0;
//    }
//}
