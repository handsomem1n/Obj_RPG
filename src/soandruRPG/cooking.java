import java.util.ArrayList;
import java.util.List;

class Cooking {
    private List<String> inventory;

    public Cooking() {
        inventory = new ArrayList<>();
    }

    public void enterKitchen() {
        System.out.println("요리실에 입장했습니다.");
    }

    public void addToInventory(Hero h, String ingredient, int cook) {
        if(!h.inventory.get(ingredient) && h.inventory.get(ingredient)!=0){
            return
            if(num == 1){
            
            }
            else if{num == 2}
        }
    }

    public void cook(String ingredient) {
        if (!inventory.contains(ingredient)) {
            System.out.println("재료가 인벤토리에 존재하지 않습니다.");
            return;
        }

        if (ingredient.equals("너구리의 꼬리")) {
            System.out.println("너구리 스튜를 만들었습니다!");
            hero_hp += 5;
            System.out.println("영웅의 체력이 5만큼 증가했습니다!");
        } else if (ingredient.equals("살쾡이의 살코기")) {
            System.out.println("살쾡이 스테이크를 만들었습니다!");
            hero_hp += 10;
            System.out.println("영웅의 체력이 10만큼 증가했습니다!");
        } else if (ingredient.equals("리본돼지의 삼겹살")) {
            System.out.println("삼겹살 구이를 만들었습니다!");
            hero_hp += 15;
            System.out.println("영웅의 체력이 15만큼 증가했습니다!");
        } else if (ingredient.equals("슬라임의 슬라임")) {
            System.out.println("슬라임 젤리를 만들었습니다!");
            hero_hp += 20;
            System.out.println("영웅의 체력이 20만큼 증가했습니다!");
        } else {
            System.out.println("잘못된 재료입니다.");
        }
    }

    public static void main(String[] args) {
        Cooking cooking = new Cooking();
        cooking.enterKitchen();

//         cooking.addToInventory("너구리의 꼬리");
//         cooking.addToInventory("살쾡이의 살코기");
//         cooking.addToInventory("리본돼지의 삼겹살");
//         cooking.addToInventory("슬라임의 슬라임");
//         이 부분은 싸움터 클래스에서 각각 몬스터를 해치웠을 때 로직 추가하면 됨.

        cooking.cook("너구리의 꼬리");
        cooking.cook("살쾡이의 살코기");
        cooking.cook("리본돼지의 삼겹살");
        cooking.cook("슬라임의 슬라임");
        cooking.cook("잘못된 재료");
    }
}
