public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int price;
    
    public Weapon(String name, int damage, int price) {
        this.name = name;
        this.damage = damage;
        this.price = price;
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
        super("위자드 스테프", 20, 100);
    }
}

class WarriorWeapon extends Weapon {
    public WarriorWeapon() {
        super("청룡 대검", 20, 100);
    }
}

class RogueWeapon extends Weapon {
    public RogueWeapon() {
        super("포이즌 단검", 25, 110);
    }
}
