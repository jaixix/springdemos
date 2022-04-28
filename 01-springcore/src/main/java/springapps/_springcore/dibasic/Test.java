package springapps._springcore.dibasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/dibasic/config.xml");
		
		//Get the 'emp' bean from the container (Defined in the config.xml  file)
		Employee emp = (Employee) context.getBean("emp");
		
		//Printing the Bean
		System.out.println(emp);
	}
}
