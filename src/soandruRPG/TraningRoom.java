package soandruRPG;
import java.util.Scanner;

class TrainingRoom extends Monster {
	private Monster monster;
	private int experience;

	public int battle() {
		Scanner sc = new Scanner(System.in);

		Training_Monster1 m = new Training_Monster1();
		System.out.println(m.monster_name + "과의 전투를 시작합니다.");
		// battle 클래스에서 전투 시작
		// (인수로 히어로 객체와 몬스터 객체를 넘겨서 거기서 히어로와 몬스터에 각각 내장되어 있는 공격 방어 메서드를 실행하고 계산된 값으로 전투
		// 진행을 battle 클래스에서 사용)
		// 몬스터 피가 0 이되거나 내 피가 0이 되었을때 return
		// 이겼다면 경험치 지급과 더 전투 할거냐고 물어보고 졌으면 공략 실패했다는 메세지와 함께 그냥 팅김
		experience += m.monster_experience;
		System.out.println(experience);
		System.out.println("다음 전투를 진행 하시겠습니까?");
		if (sc.nextInt() == 2) {
			System.out.println("전투를 종료합니다 ");
			System.out.println("전투 보상 경험치 총 " + experience + "을 획득합니다.");
			return experience;
		}
		Training_Monster2 m2 = new Training_Monster2();
		System.out.println(m2.monster_name + "과의 전투를 시작합니다.");
		experience += m2.monster_experience;
		System.out.println(experience);
		System.out.println("다음 전투를 진행 하시겠습니까?");
		if (sc.nextInt() == 2) {
			System.out.println("전투를 종료합니다 ");
			System.out.println("전투 보상 경험치 총 " + experience + "을 획득합니다.");
			return experience;
		}
		Training_Monster3 m3 = new Training_Monster3();
		System.out.println(m3.monster_name + "과의 전투를 시작합니다.");
		experience += m3.monster_experience;
		System.out.println(experience);
		System.out.println("다음 전투를 진행 하시겠습니까?");
		if (sc.nextInt() == 2) {
			System.out.println("전투를 종료합니다 ");
			System.out.println("전투 보상 경험치 총 " + experience + "을 획득합니다.");
			return experience;
		}
		Training_Monster4 m4 = new Training_Monster4();
		System.out.println(m4.monster_name + "과의 전투를 시작합니다.");
		experience += m4.monster_experience;
		System.out.println(experience);
		System.out.println("모든 몬스터를 격파하였습니다.?");
		System.out.println("전투를 종료합니다 ");

		System.out.println("전투 보상 경험치 총 " + experience + "을 획득합니다.");
		return experience;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TrainingRoom t = new TrainingRoom();
		t.battle();
	}

}
