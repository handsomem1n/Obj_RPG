// File: SOandRU/WeaponShop.java
package SOandRU;

import java.util.ArrayList;
import java.util.Scanner;

public class WeaponShop {
    private ArrayList<Weapon> weapons;

    public WeaponShop() {
        weapons = new ArrayList<>();
        // Add some weapons
        weapons.add(new Weapon("Sword", 100, 20));
        weapons.add(new Weapon("Staff", 80, 20));
        weapons.add(new Weapon("Dagger", 50, 20));
    }

    public void showWeapons() {
        for (int i = 0; i < weapons.size(); i++) {
            Weapon weapon = weapons.get(i);
            System.out.println((i + 1) + ": " + weapon.getName() + ": " + weapon.getCost() + " 원" + " - " + weapon.getDamage());
        }
    }

    public void purchaseWeapon(int index) {
        if (index >= 1 && index <= weapons.size()) {
            Weapon weapon = weapons.get(index - 1);
            System.out.println("구매 성공 : " + weapon.getName());
        } else {
            System.out.println("금액이 모자랍니다.");
        }
    }
}
