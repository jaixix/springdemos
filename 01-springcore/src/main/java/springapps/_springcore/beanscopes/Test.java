package springapps._springcore.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/beanscopes/config.xml");
		
		//Get the 'prescriptions' bean from the container (Defined in the config.xml  file)
		Address address = (Address) context.getBean("address");
		
		//Printing the Bean
		System.out.println(address);
		System.out.println("First Object HashCode : " + address.hashCode());
		
		Address address2 = (Address) context.getBean("address");
		System.out.println(address2);
		System.out.println("Second Object HashCode : " + address2.hashCode());
		
		Address address3 = (Address) context.getBean("address");
		System.out.println(address3);
		System.out.println("Third Object HashCode : " + address3.hashCode());
	}
}