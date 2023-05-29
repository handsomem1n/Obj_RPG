package cook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
[["꼬리",5],["고기",10],["삼겹살",20]]
public class cook {
	private List<String> inventory;
	private Map<String, Integer> ingredientEffects;

	public cook() {
		inventory = new ArrayList<>();
		ingredientEffects = new HashMap<>();
		ingredientEffects.put("너구리의 꼬리", 5);
		ingredientEffects.put("살쾡이의 살코기", 10);
		ingredientEffects.put("리본돼지의 삼겹살", 15);
		ingredientEffects.put("슬라임의 슬라임", 20);
	}

	public void enterKitchen() {
		System.out.println("요리실에 입장했습니다.");
	}

	public void addToInventory(String ingredient) {
		inventory.add(ingredient);
	}

	public void addToInventory(Hero h, String ingredient, int quantity) {
		if (!h.inventory.containsKey(ingredient) || h.inventory.get(ingredient) == 0) {
			System.out.println("재료가 인벤토리에 존재하지 않습니다.");
			return;
		}

		h.inventory.put(ingredient, h.inventory.get(ingredient) + quantity);
	}

	public void makeDish(String menu) {
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

		if (!inventory.contains(ingredient)) {
			System.out.println(ingredient + " 재료가 인벤토리에 존재하지 않습니다.");
			return;
		}

		int quantity = getInventoryQuantity(ingredient);
		System.out.println(ingredient + ": " + quantity);

		if (ingredientEffects.containsKey(ingredient)) {
			int effect = ingredientEffects.get(ingredient);
			System.out.println(menu + "를 만들었습니다!");
			System.out.println("영웅의 체력이 " + effect + "만큼 증가했습니다!");
		}
	}

	private int getInventoryQuantity(String ingredient) {
		int quantity = 0;
		for (String item : inventory) {
			if (item.equals(ingredient)) {
				item.
				quantity++;
			}
		}
		return quantity;
	}

	public static void main(String[] args) {
		cook cooking = new cook();
		cooking.enterKitchen();
		System.out.println(cooking.inventory);
		cooking.addToInventory("너구리의 꼬리");
		cooking.addToInventory("살쾡이의 살코기");
		cooking.addToInventory("살쾡이의 살코기");
		// cooking.addToInventory("리본돼지의 삼겹살");
		// cooking.addToInventory("슬라임의 슬라임");
		// 이 부분은 싸움터 클래스에서 각각 몬스터를 해치웠을 때 로직 추가하면 됨.

		System.out.println("너구리 꼬리 스튜, 살쾡이 스테이크, 삼겹살 구이, 슬라임 젤리");
		System.out.print("원하시는 메뉴를 골라주세요: ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();

		cooking.makeDish(menu);
	}
}
