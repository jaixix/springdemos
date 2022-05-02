package springapps._springcore.stereotypeannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/stereotypeannotations/config.xml");
		
		//Get the 'coach' bean from the container (Defined in the config.xml  file)
		Coach coach1 = (Coach) context.getBean("coach");
		
		//Printing the Bean
		System.out.println(coach1);
		System.out.println("# Code = " + coach1.hashCode());
		
//		Coach coach2 = (Coach) context.getBean("coach");
//		System.out.println(coach2);
//		System.out.println(coach2.hashCode());
	}
}