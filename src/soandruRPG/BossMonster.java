package soandruRPG;

import java.util.Random;
import java.util.Scanner;

class BossMonster extends Monster {
	int clearBoss = 0;

	public void bossBattle(Hero h, Monster m, int i) {

		BossMonster2 boss2 = new BossMonster2();
		BossMonster3 boss3 = new BossMonster3();
		BossMonster4 boss4 = new BossMonster4();
		Scanner sc = new Scanner(System.in);
		HuntingGround hunt = new HuntingGround();
		BossMonster bossMonster[] = { boss2, boss3, boss4 };
		System.out.println("*********************");
		System.out.println(m.monster_name + "과의 전투를 시작합니다.");
		while (true) {
			clearBoss++;
			System.out.println(h.name + "의 공격입니다.");
			// m.monster_attacked(h.defense,h.attack());
			System.out.println("1번: 기본공격 ");
			System.out.println("2번: 스킬1 ");
			System.out.println("3번: 스킬2 ");
			System.out.print("사용하려는 스킬을 선택해주세요 : ");
			int skillNum = sc.nextInt();
			if (skillNum == 2 && h.mp < 30 || skillNum == 3 && h.mp < 50) {
				System.out.println("마나가 부족합니다 다른 스킬을 선택해 주세요");
				continue;
			} else if (skillNum == 2) {
				h.mp -= 30;
			} else if (skillNum == 3) {
				h.mp -= 50;
			}
			hunt.heroAttack(m, h.attack(skillNum));
			// 몬스터 hp가 0이 되었을 경우
			if (m.monster_hp <= 0) {
				// 몬스터를 잡고 얻은 경험치를 변수에 저장
				h.experience += m.monster_experience;
				h.money += m.monster_money;
				System.out.println("*********************");
				System.out.println(m.monster_name + "을 처치하여 " + m.monster_experience + "의 경험치를 획득하였습니다.");
				System.out.println(m.monster_name + "을 처치하여 " + m.monster_money + "의 돈을 획득하였습니다.");
				if (i == 3) {
					System.out.println("모든 보스를 격파하였습니다. 축하합니다.");
					System.out.println("*********************");
					System.out.printf("마을 촌장 : %s(이/가) 마을을 구했다 !!!", h.name);
					System.out.print("\n");
					System.out.printf("마을 어르신1 : 정말 대단해 %s !!!!", h.name);
					System.out.printf("마을 어르신2 : 우리에게 평화가 찾아왔다!!");
					System.out.printf("마을 사람들 : 고마워 %s !!", h.name);
					break;
				}
				System.out.println("*********************");
				System.out.println("다음 전투를 진행 합니다.");
				// 재귀함수를 통해 다음 배열의 몬스터와 전투 로직

				bossBattle(h, bossMonster[i++], i++);
				// 모든 전투가 끝나서 return될때 각 재귀단계가 종료되는 break문
				break;
			}
			// 몬스터 공격 프로세스
			System.out.println(m.monster_name + "의 공격입니다.");
			hunt.monster_attacked(h, m.monster_attack());
			// 히어로 hp가 0이 되었을 경우 전투 while문을 종료하고, 경험치 증가 시키는 부분
			if (h.hp <= 0) {
				System.out.println(h.name + "체력이 0이되어 보스전을 종료합니다.");
				System.out.println("*********************");
				break;
			}
		}
	}

//	public static void main(String[] args) {
//		Mage h = new Mage("nam");
//		BossMonster1 m2 = new BossMonster1();
//		m2.bossBattle(h, m2, 0);
//
//	}
}

class BossMonster1 extends BossMonster {
	public BossMonster1() {
		monster_name = "동쪽왕";
		monster_hp = 15000;
		monster_defense = 200;
		monster_power = 1000;
		monster_mp = 0;
		monster_level = 25;
		monster_experience = 500;
		monster_money = 1000;
	}

	public int monster_attack() {
		Random random = new Random();
		int num = random.nextInt(3);
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.monster_level * 10) + (this.monster_power * 20);

		case 2: // 스킬1
			System.out.println("포효소리");
			return (this.monster_level * 15) + (this.monster_power * 30);

		case 3: // 스킬2
			System.out.println("할퀴기");
			return (this.monster_level * 20) + (this.monster_power * 40);
		}
	}
}

class BossMonster2 extends BossMonster {
	public BossMonster2() {
		monster_name = "서쪽왕";
		monster_hp = 17000;
		monster_defense = 300;
		monster_power = 1300;
		monster_mp = 0;
		monster_level = 28;
		monster_experience = 700;
		monster_money = 1500;
	}

	public int monster_attack() {
		Random random = new Random();
		int num = random.nextInt(3);
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.monster_level * 10) + (this.monster_power * 20);

		case 2: // 스킬1
			System.out.println("포효소리");
			return (this.monster_level * 15) + (this.monster_power * 30);

		case 3: // 스킬2
			System.out.println("할퀴기");
			return (this.monster_level * 20) + (this.monster_power * 40);
		}
	}

	Mage m = new Mage("nam");

}

class BossMonster3 extends BossMonster {
	public BossMonster3() {
		monster_name = "북쪽왕";
		monster_hp = 20000;
		monster_defense = 400;
		monster_power = 1600;
		monster_mp = 0;
		monster_level = 35;
		monster_experience = 2000;
		monster_money = 1000;
	}

	public int monster_attack() {
		Random random = new Random();
		int num = random.nextInt(3);
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.monster_level * 10) + (this.monster_power * 20);

		case 2: // 스킬1
			System.out.println("포효소리");
			return (this.monster_level * 15) + (this.monster_power * 30);

		case 3: // 스킬2
			System.out.println("할퀴기");
			return (this.monster_level * 20) + (this.monster_power * 40);
		}
	}

}

class BossMonster4 extends BossMonster {
	public BossMonster4() {
		monster_name = "남쪽왕";
		monster_hp = 25000;
		monster_defense = 600;
		monster_power = 1800;
		monster_mp = 0;
		monster_level = 40;
		monster_experience = 2500;
		monster_money = 2000;
	}

	public int monster_attack() {
		Random random = new Random();
		int num = random.nextInt(3);
		switch (num) {
		default:
		case 1:
			// 기본 공격
			return (this.monster_level * 10) + (this.monster_power * 20);

		case 2: // 스킬1
			System.out.println("포효소리");
			return (this.monster_level * 15) + (this.monster_power * 30);

		case 3: // 스킬2
			System.out.println("할퀴기");
			return (this.monster_level * 20) + (this.monster_power * 40);
		}

	}

}
