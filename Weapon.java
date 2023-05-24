public abstract class Weapon {
    protected String name;
    protected int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}

class WizardWeapon extends Weapon {
    public WizardWeapon() {
        super("위자드 스테프", 35);
    }
}

class WarriorWeapon extends Weapon {
    public WarriorWeapon() {
        super("청룡 대검", 50);
    }
}

class RogueWeapon extends Weapon {
    public RogueWeapon() {
        super("포이즌 단검", 40);
    }
}
