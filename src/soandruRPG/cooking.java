import java.util.HashMap;

class Cooking {
    private HashMap<String, Integer> inventory;
    private int heroHp;

    public Cooking() {
        inventory = new HashMap<>();
    }

    public void enterKitchen() {
        System.out.println("요리실에 입장했습니다.");
    }

    public void addToInventory(String ingredient, int hpIncrease) {
        inventory.put(ingredient, hpIncrease);
    }

    public void cook(String ingredient) {
        if (!inventory.containsKey(ingredient)) {
            System.out.println("재료가 인벤토리에 존재하지 않습니다.");
            return;
        }

        int hpIncrease = inventory.get(ingredient);
        heroHp += hpIncrease;
        System.out.println(ingredient + "로 요리를 만들었습니다!");
        System.out.println("Hero의 HP가 증가했습니다. 현재 HP: " + heroHp);
    }

    public static void main(String[] args) {
        Cooking cooking = new Cooking();
        cooking.enterKitchen();

        cooking.addToInventory("너구리의 꼬리", 5);
        cooking.addToInventory("살쾡이의 살코기", 10);
        cooking.addToInventory("리본돼지의 삼겹살", 15);
        cooking.addToInventory("슬라임의 슬라임", 20);

        cooking.cook("너구리의 꼬리");
        cooking.cook("살쾡이의 살코기");
        cooking.cook("리본돼지의 삼겹살");
        cooking.cook("슬라임의 슬라임");
        cooking.cook("잘못된 재료");
    }
}
