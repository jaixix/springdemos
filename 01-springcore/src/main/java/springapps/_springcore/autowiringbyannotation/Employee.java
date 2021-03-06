package springapps._springcore.autowiringbyannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private int age;
	private String name;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired //can also be done at property or constructor level.
	public void setAddress(Address address) {
		this.address = address;
	}
}
