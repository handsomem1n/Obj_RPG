package soandruRPG;

import java.util.HashMap;
import java.util.Scanner;

//map = {"너구리의 꼬리":5}
//hero hp+=map.get(너구리 꼬리) 5 
public class cooking {
	public HashMap<String, Integer> eating = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public cooking(Hero h) {
//		h.inventory.put("너구리의 꼬리", 5);
//		h.inventory.put("살쾡이의 살코기", 10);
//		h.inventory.put("리본돼지의 삼겹살", 15);
//		h.inventory.put("슬라임의 슬라임", 20);
		eating.put("들쥐의 꼬리", 5);
		eating.put("불독의 뼈", 10);
		eating.put("늑대의 고기", 15);
		eating.put("곰의 앞발", 20);
	}

//	public void addToInventory(String ingredient) {
//		inventory.add(ingredient);
//	}

//	public void addToInventory(Hero h, String ingredient, int quantity) {
//		if (!h.inventory.containsKey(ingredient) || h.inventory.get(ingredient) == 0) {
//			System.out.println("재료가 인벤토리에 존재하지 않습니다.");
//			return;
//		}

//		h.inventory.put(ingredient, h.inventory.get(ingredient) + quantity);
//	}

	public void makeDish(Hero h) {
		if (h.inventory.isEmpty()) {
			System.out.println("요리 재료가 없습니다.");
			return;
		}
		System.out.println(h.inventory);
		System.out.println("들쥐의 꼬리 스튜, 불독 뼈 탕, 늑대고기 스테이크, 곰 발바닥 찜");
		System.out.println("만약 요리를 만들고 싶지 않다면 '만들지 않기'를 입력해 주세요");
		System.out.print("원하시는 메뉴를 골라주세요: ");

		String ingredient = null;
		String menu = sc.nextLine();
		if (menu.equals("들쥐의 꼬리 스튜")) {
			ingredient = "들쥐의 ";
		} else if (menu.equals("불독 뼈 탕")) {
			ingredient = "불독의 뼈";
		} else if (menu.equals("늑대고기 스테이크")) {
			ingredient = "늑대의 고기";
		} else if (menu.equals("곰 발바닥 찜")) {
			ingredient = "곰의 앞발";
		} else if (menu.equals("만들지 않기")) {
			return;
		} else {
			System.out.println("잘못된 메뉴입니다.");
			return;
		}

		if (!h.inventory.containsKey(ingredient) || h.inventory.get(ingredient) == 0) {
			System.out.println(ingredient + " 재료가 인벤토리에 존재하지 않습니다.");
			return;
		}
//		int quantity = getInventoryQuantity(ingredient);
		System.out.println(ingredient + ": " + h.inventory.get(ingredient) + "개 있습니다.");
		h.inventory.put(ingredient, h.inventory.get(ingredient) - 1);
		System.out.println(h.inventory);
		h.total_hp += eating.get(ingredient);
		System.out.println(menu + "를 만들었습니다!");
		System.out.println("영웅의 체력이 " + eating.get(ingredient) + " 증가했습니다!");
	}

//	private int getInventoryQuantity(String ingredient) {
//		int quantity = 0;
//		for (String item : inventory) {
//			if (item.equals(ingredient)) {
//				item.quantity++;
//			}
//		}
//		return quantity;
//	}

// 	public static void main(String[] args) {
// 		Mage m = new Mage("nam");
// 		cooking cooking = new cooking(m);
// 		cooking.enterKitchen();
// 		Scanner sc = new Scanner(System.in);
// 		String menu = sc.nextLine();
// 		cooking.makeDish(h, menu);
// 	}
}
