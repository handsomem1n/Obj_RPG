package soandruRPG;

import java.util.Random;
import java.util.Scanner;

public class mini_game_2 {

	String[] choices = { "가위", "바위", "보" };

	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	public void playGame2(Hero h) {
		System.out.println("게임 설명 : 몬스터와의 가위바위보 게임에서 이기세요!");

		boolean playAgain = true;
		while (playAgain) {
			System.out.print("가위, 바위, 보 중에서 하나를 선택하세요 : ");
			String userChoice = sc.nextLine();

			if (!isValidChoice(userChoice)) {
				System.out.println("올바른 선택지가 아닙니다. 다시 선택해주세요.");
				continue;
			}

			int computerIndex = random.nextInt(3);
			String computerChoice = choices[computerIndex];

			System.out.println("Hero 선택 : " + userChoice);
			System.out.println("Monster 선택 : " + computerChoice);

			System.out.println("결과 : " + getWinner(userChoice, computerChoice, h));

			System.out.print("계속 하시겠습니까? (Y/N): ");
			String playAgainChoice = sc.nextLine();

			if (playAgainChoice.equalsIgnoreCase("N")) {
				playAgain = false;
			}
		}

		System.out.println("게임을 종료합니다.");
	}

	public static boolean isValidChoice(String choice) {
		return choice.equals("가위") || choice.equals("바위") || choice.equals("보");
	}


	public static String getWinner(String userChoice, String computerChoice, Hero h) {
		if (userChoice.equals(computerChoice)) {
			return "비겼습니다!";
		} else if ((userChoice.equals("가위") && computerChoice.equals("보"))
				|| (userChoice.equals("바위") && computerChoice.equals("가위"))
				|| (userChoice.equals("보") && computerChoice.equals("바위"))) {

			h.setMoney(h.getMoney() + 20);
			System.out.print("Hero의 현재 돈: " + h.getMoney());
			return "이겼습니다!";
		} else {
			return "졌습니다! 다음 기회를 노리세요!";
		}
	}
}
