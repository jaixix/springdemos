package springapps._springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		// Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springapps/_springcore/constructorinjection/config.xml");

		// Get the 'prescriptions' bean from the container (Defined in the config.xml
		// file)
		Address address = (Address) context.getBean("address");

		// Printing the Bean
		System.out.println(address);
		System.out.println("First Object HashCode : " + address.hashCode());

	}
}