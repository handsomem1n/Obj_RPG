package soandruRPG;
// package SOandRU;
import java.util.ArrayList;

public class WeaponShop {
	private ArrayList<Weapon> weapons;

	public WeaponShop() {
		this.weapons = new ArrayList<>(); // 상점이 보유한 무기들을 저장하기 위한 리스트

		// 팩토리에서 무기를 가져와 추가(상점에 들를때마다 무기 재고 채워지게 우선 구현)
		this.weapons.add(WeaponFactory.createWizardWeapon1());
		this.weapons.add(WeaponFactory.createWizardWeapon2());
		this.weapons.add(WeaponFactory.createWarriorWeapon1());
		this.weapons.add(WeaponFactory.createWarriorWeapon2());
		this.weapons.add(WeaponFactory.createRogueWeapon1());
		this.weapons.add(WeaponFactory.createRogueWeapon2());
	}
	
// 리스트 등록에 번거로움으로 무기 구매를 번호로 입력받지않고 등록된 무기리스트와 동일한 문자열을 입력하게 하여 구매
	public void buyWeapon(Hero hero, String weaponName) {
		Weapon weaponToBuy = null; // 에러 방지의 일환 예외 처리
		for (Weapon weapon : weapons) {
			if (weapon.getName().equals(weaponName)) {
				weaponToBuy = weapon;
				break;
			}
		}

		if (weaponToBuy != null) {
			if (hero.getMoney() >= weaponToBuy.getPrice()) {
				hero.setMoney(hero.getMoney() - weaponToBuy.getPrice());
				System.out.println(weaponName + " 구매 성공! 잔여 액수: " + hero.getMoney());
			} else {
				System.out.println("구매 실패! " + weaponName);
			}
		} else {
			System.out.println("찾을 수 없음..");
		}
	}

	public void displayWeapons() {
		for (Weapon weapon : weapons) {
			System.out.println(
					"무기 이름: " + weapon.getName() + ", 데미지: " + weapon.getDamage() + ", 금액: " + weapon.getPrice());
		}
	}
}
