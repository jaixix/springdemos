package springapps._springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/set/config.xml");
		
		//Get the 'cars' bean from the container (Defined in the config.xml  file)
		CarDealer cars = (CarDealer) context.getBean("cars");
		
		//Printing the Bean
		System.out.println(cars);
		System.out.println(cars.getModels().getClass());
	}
}
