package soandruRPG;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("*******RPG GAME*******");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 도적");
		System.out.printf("직업의 번호를 입력하세요. : ");

		int num = sc1.nextInt();

		String name = sc2.next();

//		Hero h = new Hero(name);
		Hero h = null;
		switch (num) {
		case 1:
			// 전사 생성
			System.out.println("전사가 선택되었습니다.");
			System.out.printf("영웅의 이름을 입력하세요. : ");
			h = new Warrior(name);
//			h = w;
			break;
		case 2:
			// 마법사 생성
			System.out.println("마법사가 선택되었습니다.");
			System.out.printf("영웅의 이름을 입력하세요. : ");
			h = new Mage(name);
			break;
		case 3:
			// 도적 생성
			System.out.println("도적이 선택되었습니다.");
			System.out.printf("영웅의 이름을 입력하세요. : ");
			h = new Rogue(name);
			break;
		}
		System.out.print(h.hp);
	}

}
