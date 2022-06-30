package springdemos._springselfprac.sterotypeannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemos/_springselfprac/sterotypeannotations/config.xml");
		
		//Get 'coach' bean
		Coach coach1 = (Coach) context.getBean("coach");
		Coach coach2 = (Coach) context.getBean("coach");
		//Printing Beans
		System.out.println(coach1);
		System.out.println(coach1.hashCode());
		System.out.println(coach2);
		System.out.println(coach2.hashCode());
	}
}