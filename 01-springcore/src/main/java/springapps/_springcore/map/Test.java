package springapps._springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/map/config.xml");
		
		//Get the 'customer' bean from the container (Defined in the config.xml  file)
		Customer customer = (Customer) context.getBean("customer");
		
		//Printing the Bean
		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());
	}
}
