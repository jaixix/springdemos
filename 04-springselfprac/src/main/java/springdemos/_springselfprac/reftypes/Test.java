package springdemos._springselfprac.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemos/_springselfprac/reftypes/config.xml");
		
		//Getting 'student' bean
		Student student = (Student) context.getBean("student");
		//Printing Bean
		System.out.println(student);
	}
}
