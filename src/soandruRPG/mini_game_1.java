package soandruRPG;

import java.util.Scanner;
import java.util.Random;

public class mini_game_1 {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	public void playGame(Hero h) {
		System.out.println("게임 설명 : 5번의 기회 안에 몬스터 10마리 중 진짜를 찾으세요!");
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

		int monsterLocation = random.nextInt(10) + 1;
		int attempts = 0;
		boolean foundMonster = false;

		while (attempts < 5 && !foundMonster) {
			System.out.print("몬스터 번호를 입력하세요: ");
			int guess = scanner.nextInt();
			attempts++;

			if (guess < 1 || guess > 10) {
				System.out.println("1부터 10까지의 숫자 중에서 입력해주세요.");
				continue;
			}

			if (guess == monsterLocation) {
				foundMonster = true;
				System.out.println("축하합니다! 몬스터를 찾았습니다.");
				System.out.println("총 시도 횟수: " + attempts);
				h.setMoney(h.getMoney() + 20); // 만약 몬스터를 찾으면 히어로의 돈이 증가하게 된다.
				System.out.print("Hero의 현재 돈: " + h.getMoney());
			} else {
				System.out.println("몬스터는 다른 위치에 있습니다.");

				if (guess < monsterLocation) {
					System.out.println("더 큰 숫자를 추측해보세요.");
				} else {
					System.out.println("더 작은 숫자를 추측해보세요.");
				}
			}
		}

		if (!foundMonster) {
			System.out.println("아쉽습니다. 몬스터를 찾지 못했습니다.");
			System.out.println("정답은 " + monsterLocation + "입니다.");
		}
	}
}
