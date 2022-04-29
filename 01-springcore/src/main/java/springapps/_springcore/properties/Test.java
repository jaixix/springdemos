package springapps._springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/properties/config.xml");
		
		//Get the 'locations' bean from the container (Defined in the config.xml  file)
		Locations locations = (Locations) context.getBean("locations");
		
		//Printing the Bean
		System.out.println(locations);
		System.out.println(locations.getDialect().getClass());
	}
}
