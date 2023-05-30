package soandruRPG;

import java.util.Scanner;

class TrainingRoom extends HuntingGround {
	private int experience;
	private Training_Monster2 m2 = new Training_Monster2();
	private Training_Monster3 m3 = new Training_Monster3();
	private Training_Monster4 m4 = new Training_Monster4();
	private Monster Trainig_monster[] = { m2, m3, m4 };

	public void battle(Hero h, Monster m, int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println(m.monster_name + "과의 전투를 시작합니다.");
		// battle 클래스에서 전투 시작
		// (인수로 히어로 객체와 몬스터 객체를 넘겨서 거기서 히어로와 몬스터에 각각 내장되어 있는 공격 방어 메서드를 실행하고 계산된 값으로 전투
		// 진행을 battle 클래스에서 사용)
		// 몬스터 피가 0 이되거나 내 피가 0이 되었을때 break;
		// 이겼다면 경험치 지급과 더 전투 할거냐고 물어보고 졌으면 공략 실패했다는 메세지와 함께 그냥 팅김
		while (true) {

			System.out.println(h.name + "의 공격입니다.");
			// m.monster_attacked(h.defense,h.attack());
			System.out.println("1번: 기본공격 ");
			System.out.println("2번: 스킬1 ");
			System.out.println("3번: 스킬2 ");
			System.out.print("사용하려는 스킬을 선택해주세요");
			int skillNum = sc.nextInt();
			if (skillNum == 2 && h.mp < 30 || skillNum == 3 && h.mp < 50) {
				System.out.println("마나가 부족합니다 다른 스킬을 선택해 주세요");
				continue;
			} else if (skillNum == 2) {
				h.mp -= 30;
			} else if (skillNum == 3) {
				h.mp -= 50;
			}
			heroAttack(m, h.attack(skillNum));
			// 몬스터 hp가 0이 되었을 경우
			if (m.monster_hp <= 0) {
				// 몬스터를 잡고 얻은 경험치를 변수에 저장
				experience += m.monster_experience;
				System.out.println("지금 종료하면 " + experience + " 경험치를 획득 가능합니다");
				System.out.println("다음 전투를 진행 하시겠습니까?");
				System.out.println("전투를 진행 하시려면 1번을 눌러주세요");
				System.out.println("전투를 종료 하시려면 2번을 눌러주세요");
				// 1번 선택시 다음 몬스터와 전투
				// 재귀함수를 통해 다음 배열의 몬스터와 전투 로직
				if (sc.nextInt() == 1) {
					if (i == 3)
						break;
					battle(h, Trainig_monster[i++], i++);
					// 모든 전투가 끝나서 return될때 각 재귀단계가 종료되는 break문
					break;

				} else {
					// 1을 선택하지 않고(2번선택지로 만들예정) 전투를 종료한다고 했을 경우 경험치를 증가하고 while문을 종료
					System.out.println("전투를 종료합니다 ");
					System.out.println("전투 보상 경험치 총 " + experience + "을 획득합니다.");
					h.experience += experience;
					break;
				}
			}
			// 몬스터 공격 프로세스
			System.out.println(m.monster_name + "의 공격입니다.");
			monster_attacked(h, m.monster_attack());
			// 히어로 hp가 0이 되었을 경우 전투 while문을 종료하고, 경험치 증가 시키는 부분
			if (h.hp <= 0) {
				System.out.println(h.name + "체력이 0이되어 훈련을 종료합니다.");
				h.experience += experience;
				System.out.println(h.experience + "경험치를 획득하였습니다.");
				break;
			}
		}
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Mage h = new Mage("nam");
//		Training_Monster1 m = new Training_Monster1();
//		TrainingRoom t = new TrainingRoom();
//		Scanner sc = new Scanner(System.in);
//		// 처음에 강화된 몬스터1을 잡기 위해서 인수로 1번 몬스터를 넣어줘야 하며 이후 로직은 battle의 증감문을 통해 다음몬스터랑 배틀 가능
//		t.battle(h, m, 0);
//		System.out.println(h.experience);
//	}

}
