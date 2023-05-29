class Cooking {

    public void Cooking() {
        System.out.println("요리실에 입장했습니다.");
    }

    public void cook(String ingredient) {
        if (ingredient.equals("너구리의 꼬리")) {
            System.out.println("너구리 스튜를 만들었습니다!");
//             heroHp += 5;
        } else if (ingredient.equals("살쾡이의 살코기")) {
            System.out.println("살쾡이 스테이크를 만들었습니다!");
//             heroHp += 10;
        } else if (ingredient.equals("리본돼지의 삼겹살")) {
            System.out.println("삼겹살 구이를 만들었습니다!");
//             heroHp += 15;
        } else if (ingredient.equals("슬라임의 슬라임")) {
            System.out.println("슬라임 젤리를 만들었습니다!");
//             heroHp += 20;
        } else {
            System.out.println("잘못된 재료입니다.");
            return;
        }

//         System.out.println("Hero의 HP가 증가했습니다. 현재 HP: " + heroHp);
    }

    public static void main(String[] args) {
        Cooking cooking = new Cooking();
        cooking.Cooking();

        cooking.cook("너구리의 꼬리");
        cooking.cook("살쾡이의 살코기");
        cooking.cook("리본돼지의 삼겹살");
        cooking.cook("슬라임의 슬라임");
        cooking.cook("잘못된 재료");
    }
}
