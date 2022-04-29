package springapps._springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/list/config.xml");
		
		//Get the 'hosp' bean from the container (Defined in the config.xml  file)
		Hospital hosp = (Hospital) context.getBean("hosp");
		Hospital hosp2 = (Hospital) context.getBean("hosp2");
		
		//Printing the Bean
		System.out.println(hosp);
		System.out.println(hosp2);
	}
}
