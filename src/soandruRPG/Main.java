package soandruRPG;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*******RPG GAME*******");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 도적");
		System.out.printf("직업의 번호를 입력하세요. : ");

		int num = sc.nextInt();

		Hero h = null;
		String name;
		switch (num) {
		case 1:
			// 전사 생성
			System.out.println("전사가 선택되었습니다.");
			System.out.print("영웅의 이름을 입력하세요. : ");
			name = sc.next();
			h = new Warrior(name);
			break;
			
		case 2:
			// 마법사 생성
			System.out.println("마법사가 선택되었습니다.");
			System.out.print("영웅의 이름을 입력하세요. : ");
			name = sc.next();
			h = new Mage(name);
			break;
		case 3:
			// 도적 생성
			System.out.println("도적이 선택되었습니다.");
			System.out.print("영웅의 이름을 입력하세요. : ");
			name = sc.next();
			h = new Rogue(name);
			break;
		}
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		
		System.out.println("*********************");
		System.out.println("현재  Hero 의 이름 : " + h.name);
		System.out.println("현재 " + h.name + "의 레벨 : " + h.level);
		System.out.println("현재 " + h.name + "의 힘 : " + h.power);
		System.out.println("현재 " + h.name + "의 방어력 : " + h.defense);
		System.out.println("현재 " + h.name + "의 HP : " + h.hp);
		System.out.println("현재 " + h.name + "의 MP : " + h.mp);
		System.out.println("현재 " + h.name + "의 경험치 : " + h.experience);
		System.out.println("현재 " + h.name + "의 돈 : " + h.money + "원");
		System.out.println("*********************");
		while(true) {
			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.println("3. 수련의 방");
			System.out.println("4. 미니게임");
			System.out.println("5. 무기 상점");
			System.out.printf("입장할 장소를 입력하세요. : ");
			num = sc.nextInt();
		}
	}

}
