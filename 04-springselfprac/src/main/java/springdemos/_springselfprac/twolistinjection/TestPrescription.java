package springdemos._springselfprac.twolistinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrescription {
	public static void main(String[] args) {
		//Spring container creation
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemos/_springselfprac/twolistinjection/config.xml");
		
		//Getting bean 'prescription'
		Prescription prescription = (Prescription) context.getBean("prescription");
		
		//Printing Bean
		System.out.println(prescription);
	}
}
