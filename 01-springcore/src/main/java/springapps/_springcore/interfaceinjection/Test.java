package springapps._springcore.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/interfaceinjection/config.xml");
		
		//Get the 'coach' bean from the container (Defined in the config.xml  file)
		Coach coach = (Coach) context.getBean("coach");
		
		//Printing the Bean
		System.out.println(coach);
	}
}