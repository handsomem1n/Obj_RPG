import java.util.ArrayList;

public class WeaponShop {
    private ArrayList<Weapon> weapons;

    //start. 무기 상점을 생성하고, 무기를 추가하는 기능.
    public WeaponShop() { // 매개변수 없는 생성자(WeaponShop()), 이 생성자는 ArrayList인 weapons를 초기화
        this.weapons = new ArrayList<>(); // 빈 ArrayList를 생성하여 weapons에 할당
    }

    public void addWeapon(Weapon weapon) { // Weapon 객체를 매개변수로 받아서 weapons 리스트에 추가
        this.weapons.add(weapon); // this : WeaponShop객체 지칭, weapons : WeaponShop 객체의 멤버변수 지칭 => Weapon 객체를 weapons 리스트에 추가
    }
    // Fin.무기 상점을 생성하고, 무기를 추가하는 기능. (추가된 무기들은 weapons 리스트에 저장되어 상점의 무기 목록으로 관리됨)
    
    public void buyWeapon(Hero hero, String weaponName) {
        Weapon weaponToBuy = null;
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
            System.out.println("무기 이름: " + weapon.getName() + ", 데미지: " + weapon.getDamage() + ", 금액: " + weapon.getPrice());
        }
    }
}


/*메인함수에서 실행
public class Main {
    public static void main(String[] args) {
        WeaponShop weaponStore = new WeaponStore();
        weaponShop.addWeapon(new WizardWeapon());
        weaponShop.addWeapon(new WarriorWeapon());
        weaponShop.addWeapon(new RogueWeapon());

        Hero hero = new Hero(); // (히어로 돈 받아오기)

        weaponShop.displayWeapons();
        weaponShop.buyWeapon(hero, "청룡 대검");
        weaponShop.buyWeapon(hero, "위자드 스테프");
    }
}

*/
