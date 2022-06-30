package springdemos._springselfprac.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemos/_springselfprac/autowiring/config.xml");
		
		//Get 'emp' bean
		Employee emp = (Employee) context.getBean("emp");
		
		//Printing Bean
		System.out.println(emp);
	}
}