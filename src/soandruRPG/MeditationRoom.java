package soandruRPG;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MeditationRoom {
	// 측정 시간
	String timerBuffer;
	// 시간초 기록
	private int second = 0;
	// 용사의 hp와 mp 생성자를 통해 초기화 할 예정
	private int hp, mp;
	// 로직을 통해 회복된 hp와 mp를 리턴 할 배열(이렇게 할지 회복할 hp,mp를 리턴해서 메인에서 회복할지 고민)
	private int newHpMp[] = new int[2];

	// 초를 시간으로 변환해 주는 메서드
	public void secToHHMMSS(int second) {
		int hour, min, sec;
		sec = second % 60;
		min = second / 60 % 60;
		hour = second / 3600;
		// DateTime formatting
		timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
	}

	// 시간 측정을 종료할 메서드
	public int pause() {
		try {
			System.in.read();

		} catch (IOException e) {

		}
		// stopwatch 메서드가 진행되고 이 메서드 실행하여 0을 리턴 했을때 stopwatch 메서드에서 0을 리턴받으면 종료하는 형태
		return 0;
	}

// hp와 mp 두가지를 리턴하기 위해 리턴 타입은 int 자료형의 배열
	public int[] meditation() {
		// 시간 계산을 위한 timer 메서드 실행
		Timer schedule = new Timer();
		System.out.println("명상 시작! enter를 누르면 명상이 종료 됩니다.");
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println(second + 1 + "초 경과");
				second++;
			}
		};
		// 1000ms(1초)마다 위에 오버라이드 된 메서드가 실행
		schedule.scheduleAtFixedRate(task, 0l, 1000);
		// pause 메서드가 enter로 실행되면서 위에 schedule이 종료
		pause();
		schedule.cancel();
		// 시간 초를 시,분,초로 변환해 주는 메서드
		secToHHMMSS(second);
		// pause로 종료하여 0이 리턴 되면 시간초 출력
		if (pause() == 0) {
			System.out.printf("Timer off 시간경과: [%s]%n", timerBuffer);
		}
		int newHp = (10 * second) + hp;
		int newMp = (10 * second) + mp;
		newHpMp[0] = newHp;
		newHpMp[1] = newMp;
		// 새롭게 회복된 hp와 mp 배열을 리턴
		return newHpMp;
	}

	public static void main(String[] args) {
		int meditationHpMp[];
		MeditationRoom s = new MeditationRoom();
		meditationHpMp = s.meditation();
		System.out.println(meditationHpMp[0]);
		System.out.println(meditationHpMp[1]);

	}

}
