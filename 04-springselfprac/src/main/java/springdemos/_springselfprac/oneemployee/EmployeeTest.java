package springdemos._springselfprac.oneemployee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		//creating spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemos/_springselfprac/oneemployee/config.xml");

		//get the emp bean from config.xml
		Employee emp = (Employee) context.getBean("emp");
		
		//Printing Bean
		System.out.println(emp);
	}
}
