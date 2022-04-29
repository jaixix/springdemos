package springapps._springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/reftypes/config.xml");
		
		//Get the 'student' bean from the container (Defined in the config.xml  file)
		Student student = (Student) context.getBean("student");
		
		//Printing the Bean
		System.out.println(student);
		System.out.println(student.getScores().getClass());
	}
}