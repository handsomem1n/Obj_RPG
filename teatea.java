package objectorientation;

import java.util.Scanner;
import java.util.Random;

abstract class Hero {
	String name;
	int level;
	int power;
	int hp;
	int defense;
	int mp;
	int experience;
	int money;

	int attack() {
		return level * 10 + power * 20;
	}

	void attacked(int sum) {
		if (defense >= sum) {
			hp = hp - 0;
		} else {
			hp = hp + defense - sum;
		}
	}
}

class Warrior extends Hero {
	Warrior(String name) {
		this.name = name;
		level = 1;
		power = 1;
		hp = 1;
		defense = 1;
		mp = 1;
		experience = 1;
		money = 1;
	}
}

class Mage extends Hero {
	Mage(String name) {
		this.name = name;
		level = 1;
		power = 1;
		hp = 1;
		defense = 1;
		mp = 1;
		experience = 1;
		money = 1;
	}
}

class Rogue extends Hero {
	Rogue(String name) {
		this.name = name;
		level = 1;
		power = 25;
		hp = 60;
		defense = 15;
		mp = 10;
		experience = 0;
		money = 0;
	}
}

public class teatea {
	static int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_experience, hero_money;
	// static int monster_hp, monster_defense, monster_power, monster_mp,
	// monster_level, monster_experience, monster_money;
	static String hero_name, monster_name;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******RPG GAME*******");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 도적");
		System.out.printf("직업의 번호를 입력하세요. : ");
		int num = sc.nextInt();
		Hero hero;
		if (num == 1) {
			System.out.println("전사가 선택되었습니다.");
			System.out.printf("영웅의 이름을 입력하세요. : ");
			String name = sc.next();
			hero = new Warrior(name);
		} else if (num == 2) {
			System.out.println("마법사가 선택되었습니다.");
			System.out.printf("영웅의 이름을 입력하세요. : ");
			String name = sc.next();
			hero = new Mage(name);
		} else {
			System.out.println("도적이 선택되었습니다.");
			System.out.printf("영웅의 이름을 입력하세요. : ");
			String name = sc.next();
			hero = new Rogue(name);
		}
		
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
	
		while (true) {
			System.out.println("*********************");
			System.out.println("현재  Hero 의 이름 : " + hero.name);
			System.out.println("현재 " + hero.name + "의 레벨 : " + hero.level);
			System.out.println("현재 " + hero.name + "의 힘 : " + hero.power);
			System.out.println("현재 " + hero.name + "의 방어력 : " + hero.defense);
			System.out.println("현재 " + hero.name + "의 HP : " + hero.hp);
			System.out.println("현재 " + hero.name + "의 MP : " + hero.mp);
			System.out.println("현재 " + hero.name + "의 경험치 : " + hero.experience);
			System.out.println("현재 " + hero.name + "의 돈 : " + hero.money + "원");
			System.out.println("*********************");

			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.println("3. 수련의 방");
			System.out.println("4. 미니게임");
			System.out.println("5. 무기 상점");
			System.out.printf("입장할 장소를 입력하세요. : ");
			num = sc.nextInt();

			if (num == 1) {
				System.out.println("사냥터에 입장하였습니다.");
				System.out.println("1. 너구리");
				System.out.println("2. 살쾡이");
				System.out.printf("전투할 상대를 입력하세요. : ");
				Monster monster1 = new Monster("너구리",100,0,1,20,5,10,10);
				Monster monster2= new Monster("살쾡이",2000,0,5,100,20,30,50);
				num = sc.nextInt();
				
				if (num == 1) {
					Monster monster = monster1;
				}
				if (num == 2) {
					Monster monster = monster2;
				}
				System.out.println(monster1.monster_name + "과 전투를 시작합니다.");
				while (true) {

					System.out.println(hero_name + "의 공격입니다.");
					monster1.monster_attacked(hero.hero_defense,hero_attack());

					if (monster1.monster_hp <= 0) {

						System.out.println(monster_name + "가 죽었습니다.");
						hero_experience += monster1.monster_experience;
						hero_money += monster1.monster_money;
						break;
					}

					System.out.println(monster_name + "의 공격입니다.");
					hero_attacked(monster1.monster_attack());

					if (hero_hp <= 0) {

						System.out.println(hero_name + "이 죽었습니다.");
						hero_hp = 1;
						System.out.println(hero_name + "이 체력" + hero_hp + "으로 부활했습니다.");
						break;
					}
				}
			}

			else if (num == 4) {
				System.out.println("미니 게임에 입장하였습니다.");
				System.out.println("1. 진짜 몬스터를 찾아라!");
				System.out.println("2. 몬스터와의 가위바위보에서 이겨라!");
				System.out.printf("번호를 입력하세요. : ");
				num = sc.nextInt();
				
				if (num == 1) {
					int chances = 3;
					int randomNumber = new Random().nextInt(10) + 1;
					mini_game_1(chances, randomNumber);
				}
				if (num == 2) {
					
				}
				
				
			else if (num == 5) {
				System.out.println("무기 상점에 입장하였습니다.");
				System.out.println("1. 뾰족한 단검 (50원)");
				System.out.println("2. 청룡도 (150원)");
				System.out.println("3. 흑룡검 (200원)");
				System.out.printf("원하시는 물건을 입력하세요. : ");
				num = sc.nextInt();
				int temp = hero_money;

				

			}
		}else if(num==2)

	{
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
			if (num == 1)
				hero_power += 3;
			if (num == 2)
				hero_defense += 3;
			if (num == 3)
				hero_experience += 50;
			if (num == 4)
				hero_hp += 50;
			if (num == 5)
				hero_mp += 50;
			hero_money = temp;
			System.out.println(hero_money + "원 남았습니다.");
		} else {
			System.out.println("돈이 부족합니다.");
			System.out.println(hero_money + "원 남았습니다.");
		}
	}else if(num==5)
	{
		System.out.println("무기 상점에 입장하였습니다.");
		System.out.println("1. 뾰족한 단검 (50원)");
		System.out.println("2. 청룡도 (150원)");
		System.out.println("3. 흑룡검 (200원)");
		System.out.printf("원하시는 물건을 입력하세요. : ");
		num = sc.nextInt();
		int temp = hero_money;


			if (hero_experience >= hero_level * 80) {
				hero_level += 1;
				System.out.println(hero_name + "의 레벨이" + hero_level + "이 되었습니다.");
				hero_money += hero_level * 50;
				System.out.println("레업 기념으로 돈이 " + hero_level * 50 + "원 증가하여 ");
				System.out.println(hero_money + "원이 되었습니다.");
				hero_experience = 0;
			}
		}	

	}

	if(hero_experience>=hero_level*80)
	{
		hero_level += 1;
		System.out.println(hero_name + "의 레벨이" + hero_level + "이 되었습니다.");
		hero_money += hero_level * 50;
		System.out.println("레밸업 기념으로 돈이 " + hero_level * 50 + "원 증가하여 ");
		System.out.println(hero_money + "원이 되었습니다.");
		hero_experience = 0;
	}
	}}

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

//	static int monster_attack() {
//		System.out.println("데미지는 " + monster_power + " 입니다.");
//		return monster_power;
//
//	}

//	static void monster_attacked(int sum) {
//
//		if (monster_defense >= sum) {
//			monster_hp = monster_hp - 0;
//		} else {
//			monster_hp = monster_hp + monster_defense - sum;
//		}
//	}


		if (monster_defense >= sum) {
			monster_hp = monster_hp - 0;
		} else {
			monster_hp = monster_hp + monster_defense - sum;
		}
	}
	
	static void mini_game_1(int chances, int randomNumber) {
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("게임 설명 : 몬스터 10마리 중 진짜를 찾으세요!");
		System.out.println("몬스터 1");
		System.out.println("몬스터 2");
		System.out.println("몬스터 3");
		System.out.println("몬스터 4");
		System.out.println("몬스터 5");
		System.out.println("몬스터 6");
		System.out.println("몬스터 7");
		System.out.println("몬스터 8");
		System.out.println("몬스터 9");
		System.out.println("몬스터 10");
		
		while (chances > 0) {
			System.out.printf("기회가 %d번 있습니다! 몬스터 번호를 입력해주세요. : ", chances);
			int guess = scanner.nextInt();
			
			if (guess == randomNumber) {
				System.our.println("축하합니다! 진짜 몬스터를 찾았네요!");
				// 돈 증가
				return;
			} else if (guess > randomNumber) {
				System.out.println("선택하신 몬스터 번호보다 큰 몬스터입니다!");
			} else {
				System.out.println("선택하신 몬스터 번호보다 작은 몬스터입니다!");
			}
			chances--;
		}
		System.out.printf("아쉽습니다. 정답은 %d였습니다.\n", randomNumber);
	}
	
	static int armorStore_show(int money, int num) {
		int 
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
			if (powerPotion <= money)
				return money - powerPotion;
			else
				return -1;
		}
		if (num == 2) {
			if (defensePotion <= money)
				return money - defensePotion;
			else
				return -1;
		}
		if (num == 3) {
			if (experiencePotion <= money)
				return money - experiencePotion;
			else
				return -1;
		}
		if (num == 4) {
			if (hpPotion <= money)
				return money - hpPotion;
			else
				return -1;
		}
		if (num == 5) {
			if (mpPotion <= money)
				return money - mpPotion;
			else
				return -1;
		}
		return money;
	}
}
