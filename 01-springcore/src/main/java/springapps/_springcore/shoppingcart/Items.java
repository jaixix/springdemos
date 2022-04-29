package springapps._springcore.shoppingcart;

import java.util.Map;

public class Items {
	private Map<String, Map<String, Integer>> items;

	public Map<String, Map<String, Integer>> getItems() {
		return items;
	}

	public void setItems(Map<String, Map<String, Integer>> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Items [items=" + items + "]";
	}

}
