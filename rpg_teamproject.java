package objectorientation;
import java.util.Scanner;

public class rpg_teamproject {
	static int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_experience, hero_money;
	static int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;
	static String hero_name, monster_name;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******RPG GAME*******");
		System.out.println("1. 전사");
		System.out.printf("직업의 번호를 입력하세요. : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("전사가 선택되었습니다.");
			hero_defense = 25;
			hero_power = 15;
			hero_level = 1;
			hero_hp = 80;
			hero_mp = 0;
		}
		
		System.out.printf("영웅의 이름을 입력하세요. : ");
		hero_name = sc.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");

		while (true) {
			System.out.println("*********************");
			System.out.println("현재  Hero 의 이름 : " + hero_name);
			System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
			System.out.println("현재 " + hero_name + "의 힘 : " + hero_power);
			System.out.println("현재 " + hero_name + "의 방어력 : " + hero_defense);
			System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
			System.out.println("현재 " + hero_name + "의 MP : " + hero_mp);
			System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience);
			System.out.println("현재 " + hero_name + "의 돈 : " + hero_money + "원");
			System.out.println("*********************");

			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.printf("입장할 장소를 입력하세요. : ");
			num = sc.nextInt();

			if (num == 1) {
				System.out.println("사냥터에 입장하였습니다.");
				System.out.println("1. 너구리");
				System.out.println("2. 살쾡이");
				System.out.printf("전투할 상대를 입력하세요. : ");
				num = sc.nextInt();

				if (num == 1) {
					monster_name = "너구리";
					monster_hp = 100;
					monster_mp = 0;
					monster_level = 1;
					monster_power = 20;
					monster_defense = 5;
					monster_money = 10;
					monster_experience = 10;
				}
				if (num == 2) {
					monster_name = "살쾡이";
					monster_hp = 2000;
					monster_mp = 0;
					monster_level = 5;
					monster_power = 100;
					monster_defense = 20;
					monster_money = 30;
					monster_experience = 50;
				}
				System.out.println(monster_name + "과 전투를 시작합니다.");
				while (true) {

					System.out.println(hero_name + "의 공격입니다.");
					monster_attacked(hero_attack());

					if (monster_hp <= 0) {

						System.out.println(monster_name + "가 죽었습니다.");
						hero_experience += monster_experience;
						hero_money += monster_money;
						break;
					}

					System.out.println(monster_name + "의 공격입니다.");
					hero_attacked(monster_attack());

					if (hero_hp <= 0) {

						System.out.println(hero_name + "이 죽었습니다.");
						hero_hp = 1;
						System.out.println(hero_name + "이 체력" + hero_hp + "으로 부활했습니다.");
						break;
					}
				}
			} else if (num == 2) {
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println("1. 힘 증강 포션 (30원)");
				System.out.println("2. 방어력 증강 포션 (30원)");
				System.out.println("3. 경험치 증강 포션 (100원)");
				System.out.println("4. HP 증강 포션 (10원)");
				System.out.println("5. MP 증강 포션 (10원)");
				System.out.printf("원하시는 물건을 입력하세요. : ");
				num = sc.nextInt();
				int temp = hero_money;
				if ((temp = potionStore_show(temp, num)) != -1) {
					System.out.println("구입이 완료되었습니다.");
					if (num == 1) hero_power += 3;
					if (num == 2) hero_defense += 3;
					if (num == 3) hero_experience += 50;
					if (num == 4) hero_hp += 50;
					if (num == 5) hero_mp += 50;
					hero_money = temp;
					System.out.println(hero_money + "원 남았습니다.");
				} else {
					System.out.println("돈이 부족합니다.");
					System.out.println(hero_money + "원 남았습니다.");
				}
			}

			if (hero_experience >= hero_level * 80) {
				hero_level += 1;
				System.out.println(hero_name + "의 레벨이" + hero_level + "이 되었습니다.");
				hero_money += hero_level * 50;
				System.out.println("레밸업 기념으로 돈이 " + hero_level * 50 + "원 증가하여 ");
				System.out.println(hero_money + "원이 되었습니다.");
				hero_experience = 0;
			}
		}
	}

	static int hero_attack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 쓰러스트");
		System.out.printf("공격 번호를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		if (num == 1) {

			sum += hero_level * 10;
			sum += hero_power * 30;
		}
		System.out.println("데미지는 " + sum + " 입니다.");
		return sum;
	}

	static void hero_attacked(int sum) {

		if (hero_defense >= sum) {
			hero_hp = hero_hp - 0;
		} else {
			hero_hp = hero_hp + hero_defense - sum;
		}
	}

	static int monster_attack() {
		System.out.println("데미지는 " + monster_power + " 입니다.");
		return monster_power;

	}

	static void monster_attacked(int sum) {

		if (monster_defense >= sum) {
			monster_hp = monster_hp - 0;
		} else {
			monster_hp = monster_hp + monster_defense - sum;
		}
	}

	static int potionStore_show(int money, int num) {
		int powerPotion = 30;
		int defensePotion = 30;
		int experiencePotion = 100;
		int hpPotion = 10;
		int mpPotion = 10;
		String name = "포션 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		if (num == 1) {
			if (powerPotion <= money) return money - powerPotion;
			else return -1;
		}
		if (num == 2) {
			if (defensePotion <= money) return money - defensePotion;
			else return -1;
		}
		if (num == 3) {
			if (experiencePotion <= money) return money - experiencePotion;
			else return -1;
		}
		if (num == 4) {
			if (hpPotion <= money) return money - hpPotion;
			else return -1;
		}
		if (num == 5) {
			if (mpPotion <= money) return money - mpPotion;
			else return -1;
		}
		return money;
	}
}
