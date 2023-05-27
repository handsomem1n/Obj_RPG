public void cooking(String dish) {
    System.out.println(dish + "를 준비합니다.");

    String[][] ingredients = {
        {"스테이크", "고기", "소금", "통마늘", "오일", "야채"},
        {"스파게티", "면", "소스", "야채", "치즈", "파슬리"},
        {"샐러드", "야채", "소스", "치즈", "견과류", "계란"},
        {"스프", "우유", "버터", "야채", "소금", "후추"},
        {"햄버거", "빵", "고기", "야채", "치즈", "소스"}
    };

    String[] selectedIngredients = null;
    switch (dish) {
        case "1":
            selectedIngredients = ingredients[0];
            break;
        case "2":
            selectedIngredients = ingredients[1];
            break;
        case "3":
            selectedIngredients = ingredients[2];
            break;
        case "4":
            selectedIngredients = ingredients[3];
            break;
        case "5":
            selectedIngredients = ingredients[4];
            break;
        default:
            System.out.println("유효한 메뉴를 선택하지 않았습니다.");
            return;
    }

    System.out.println(dish + "의 재료는 다음과 같습니다.");
    for (int i = 1; i < selectedIngredients.length; i++) {
        System.out.println(i + ". " + selectedIngredients[i]);
    }

    boolean canCook = true;
    for (int i = 1; i < selectedIngredients.length; i++) {
        System.out.print(selectedIngredients[i] + "이(가) 있나요? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (!input.equalsIgnoreCase("y")) {
            canCook = false;
            break;
        }
    }

    if (canCook) {
        System.out.println("가지고 있는 재료로 메뉴를 만들 수 있습니다!");
        System.out.println("재료를 넣어주세요:");
        for (int i = 1; i < selectedIngredients.length; i++) {
            System.out.print(selectedIngredients[i] + ": ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        }

        System.out.println(dish + "를 완성했습니다!");
    } else {
        System.out.println("가지고 있는 재료로 메뉴를 만들 수 없습니다.");
    }
}
