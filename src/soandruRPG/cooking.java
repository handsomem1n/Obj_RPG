package soandruRPG;

import java.util.HashMap;
import java.util.Scanner;

//map = {"너구리의 꼬리":5}
//hero hp+=map.get(너구리 꼬리) 5 
public class cooking {
	public HashMap<String, Integer> eating = new HashMap<>();

	public cooking(Hero h) {
//		h.inventory.put("너구리의 꼬리", 5);
//		h.inventory.put("살쾡이의 살코기", 10);
//		h.inventory.put("리본돼지의 삼겹살", 15);
//		h.inventory.put("슬라임의 슬라임", 20);
		eating.put("너구리의 꼬리", 5);
		eating.put("살쾡이의 살코기", 10);
		eating.put("리본돼지의 삼겹살", 15);
		eating.put("슬라임의 슬라임", 20);
	}

	public void enterKitchen() {
		System.out.println("요리실에 입장했습니다.");
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

	public void makeDish(Hero h, String menu) {
		System.out.println(h.inventory);
		System.out.println("너구리 꼬리 스튜, 살쾡이 스테이크, 삼겹살 구이, 슬라임 젤리");
		System.out.print("원하시는 메뉴를 골라주세요: ");
		String ingredient = null;

		if (menu.equals("너구리 꼬리 스튜")) {
			ingredient = "너구리의 꼬리";
		} else if (menu.equals("살쾡이 스테이크")) {
			ingredient = "살쾡이의 살코기";
		} else if (menu.equals("삼겹살 구이")) {
			ingredient = "리본돼지의 삼겹살";
		} else if (menu.equals("슬라임 젤리")) {
			ingredient = "슬라임의 슬라임";
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
		h.hp += eating.get(ingredient);
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

	public static void main(String[] args) {
		Mage m = new Mage("nam");
		cooking cooking = new cooking(m);
		cooking.enterKitchen();
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		cooking.makeDish(m, menu);
	}
}
