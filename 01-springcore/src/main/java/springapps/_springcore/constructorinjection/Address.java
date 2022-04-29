package springapps._springcore.constructorinjection;

public class Address {
	private int houseNumber;
	private String street;
	private String city;

	public Address(int houseNumber, String street, String city) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + "]";
	}

}
