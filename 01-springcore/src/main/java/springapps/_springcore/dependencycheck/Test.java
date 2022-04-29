package springapps._springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/dependencycheck/config.xml");
		
		//Get the 'prescriptions' bean from the container (Defined in the config.xml  file)
		Prescription prescriptions = (Prescription) context.getBean("prescriptions");
		
		//Printing the Bean
		System.out.println(prescriptions);
//		System.out.println(student.getScores().getClass());
	}
}