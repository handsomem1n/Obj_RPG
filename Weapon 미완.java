public abstract class Weapon {
// 무기와 관련한 정보 : 이름, 데미지, 가격
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

class WizardWeapon1 extends Weapon {
    public WizardWeapon1() {
        super("위자드 스테프", 20, 100);
    }
}

class WizardWeapon2 extends Weapon {
    public WizardWeapon2() {
        super("드래곤 완드", 30, 200);
    }
}

class WarriorWeapon1 extends Weapon {
    public WarriorWeapon1() {
        super("청룡 대검", 40, 150);
    }
}

class WarriorWeapon2 extends Weapon {
    public WarriorWeapon2() {
        super("클레이모어", 60, 250);
    }
}

class RogueWeapon1 extends Weapon {
    public RogueWeapon1() {
        super("포이즌 단검", 25, 110);
    }
}

class RogueWeapon2 extends Weapon {
    public RogueWeapon2() {
        super("듀얼블레이드", 35, 210);
    }
}
