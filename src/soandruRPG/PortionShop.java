package soandruRPG;

import java.util.Scanner;

public class PortionShop {
	private int power;
	private int defense;
	private int experience;
	private int hp;
	private int mp;
	private int powerExpense;
	private int defenseExpense;
	private int experienceExpense;
	private int hpExpense;
	private int mpExpense;

	public PortionShop() {
		this.power = 3;
		this.defense = 3;
		this.experience = 5;
		this.hp = 5;
		this.mp = 5;
		this.powerExpense = 30;
		this.defenseExpense = 30;
		this.experience = 100;
		this.hpExpense = 10;
		this.mpExpense = 10;
	}

	public void marketShow(Hero h) {
		Scanner sc = new Scanner(System.in);
		System.out.println("포션 상점에 입장하였습니다.");
		while (true) {
			System.out.println("1. 힘 증강 포션 (30원)");
			System.out.println("2. 방어력 증강 포션 (30원)");
			System.out.println("3. 경험치 증강 포션 (100원)");
			System.out.println("4. HP 증강 포션 (10원)");
			System.out.println("5. MP 증강 포션 (10원)");
			System.out.println("6. 상점 나가기");
			System.out.printf("원하시는 물건을 입력하세요. : ");
			int buy = sc.nextInt();
			if ((purcahsePortion(h, buy)) != -1) {
				System.out.println("구입이 완료되었습니다.");
				if (buy == 1)
					h.power += power;
				else if (buy == 2)
					h.defense += defense;
				else if (buy == 3)
					h.experience += experience;
				else if (buy == 4)
					h.total_hp += hp;
				else if (buy == 5)
					h.total_mp += mp;
				else if (buy == 6) {
					System.out.println("상점을 이용해 주셔서 감사합니다.");
					return;
				}
				System.out.println(h.money + "원 남았습니다.");
			} else {
				System.out.println("돈이 부족합니다.");
				System.out.println(h.money + "원 남았습니다.");
			}
			;
		}
	}

	public int purcahsePortion(Hero h, int portionNum) {
		int powerPotion = 30;
		int defensePotion = 30;
		int experiencePotion = 100;
		int hpPotion = 10;
		int mpPotion = 10;
		String name = "포션 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		if (portionNum == 1) {
			if (powerPotion <= h.money)
				return h.money -= powerExpense;
			else
				return -1;
		}
		if (portionNum == 2) {
			if (defensePotion <= h.money)
				return h.money -= defenseExpense;
			else
				return -1;
		}
		if (portionNum == 3) {
			if (experiencePotion <= h.money)
				return h.money -= experienceExpense;
			else
				return -1;
		}
		if (portionNum == 4) {
			if (hpPotion <= h.money)
				return h.money -= hpExpense;
			else
				return -1;
		}
		if (portionNum == 5) {
			if (mpPotion <= h.money)
				return h.money -= mpExpense;
			else
				return -1;
		}
		return h.money;

	}

	public static void main(String[] args) {
		Mage m = new Mage("nam");
		PortionShop p = new PortionShop();
		p.marketShow(m);
	}
}
