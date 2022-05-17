package springdemos._springselfprac.foursoppingcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// Spring container creation
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springdemos/_springselfprac/foursoppingcart/config.xml");

		// Getting 'cart' bean
		ShoppingCart cart = (ShoppingCart) context.getBean("cart");
		
		//Printing Bean
		System.out.println(cart);
	}
}
