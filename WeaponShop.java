import java.util.ArrayList;

public class WeaponShop {
    private ArrayList<Weapon> weapons;

    public WeaponShop() {
        this.weapons = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

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
        WeaponStore weaponStore = new WeaponStore();
        weaponStore.addWeapon(new WizardWeapon());
        weaponStore.addWeapon(new WarriorWeapon());
        weaponStore.addWeapon(new RogueWeapon());

        Hero hero = new Hero(); // (히어로 돈 받아오기)

        weaponStore.displayWeapons();
        weaponStore.buyWeapon(hero, "청룡 대검");
        weaponStore.buyWeapon(hero, "위자드 스테프");
    }
}

*/
