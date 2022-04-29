package springapps._springcore.shoppingcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/shoppingcart/config.xml");
		
		//Get the 'shoppingcart' bean from the container (Defined in the config.xml  file)
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
		
		//Printing the Bean
		System.out.println(shoppingcart);
//		System.out.println(shoppingcart.getScores().getClass());
	}
}