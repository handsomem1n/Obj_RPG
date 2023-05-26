/*
무기 상점이 무기를 들고 있어서서 무기 상점이 열릴 때마다 무기를 추가해야 하는 번거로움. - > 그러나 무기 클래스에 무기를 미리 등록하고, 무기 상점이 이 무기들을 가져와서 판매하는 방식을 위해
무기 팩토리라는 클래스를 만들어 무기를 미리 생성하고, 무기 상점에서는 이 팩토리에서 무기를 가져오는 방식을 사용(멘트 : 제한된 시간으로 현재는 불가하지만 추후에 무기 재고를 구현하기 위해)
*/

public class WeaponFactory {
    public static Weapon createWizardWeapon1() {
        return new WizardWeapon1();
    }

    public static Weapon createWizardWeapon2() {
        return new WizardWeapon2();
    }

    public static Weapon createWarriorWeapon1() {
        return new WarriorWeapon1();
    }

    public static Weapon createWarriorWeapon2() {
        return new WarriorWeapon2();
    }

    public static Weapon createRogueWeapon1() {
        return new RogueWeapon1();
    }

    public static Weapon createRogueWeapon2() {
        return new RogueWeapon2();
    }
}
