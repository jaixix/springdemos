package springapps._springcore.shoppingcart;

public class ShoppingCart {
	private String customerName;
//	private Item items;
	private Items items;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [customerName=" + customerName + ", items=" + items + "]";
	}

}
