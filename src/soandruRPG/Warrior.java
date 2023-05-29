package SOandRU;

import java.util.Scanner;

public class Warrior extends Hero {
	public Warrior(String name) {
		super(name);
		this.power = 15;
		this.hp = 90;
		this.defense = 30;
		this.mp = 10;
		this.experience = 0;
	}

	public int attack(int num) {
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.level * 10) + (this.power * 20);

		case 2: // 스킬1
			System.out.println("슬래시 블러스트");
			return (this.level * 15) + (this.power * 25);

		case 3: // 스킬2
			System.out.println("브레이브 슬래시");
			return (this.level * 20) + (this.power * 30);
		}
	}
}
