package springapps._springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/lifecycle/config.xml");
		
		//Get the 'patient' bean from the container (Defined in the config.xml  file)
		Patient patient = (Patient) context.getBean("patient");
		
		//Printing the Bean
		System.out.println(patient);
//		System.out.println(shoppingcart.getScores().getClass());
		context.registerShutdownHook();
	}
}