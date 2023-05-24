import java.util.ArrayList;

public class WeaponShop {
    private ArrayList<Weapon> weapons;

    public WeaponShop() {
        this.weapons = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void displayWeapons() {
        for (Weapon weapon : weapons) {
            System.out.println("Weapon Name: " + weapon.getName() + ", Damage: " + weapon.getDamage());
        }
    }
}
