package springapps._springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				" springapps/_springcore/standalone/collections/config.xml");

		// get the hospital bean from the container
		ProductList prods = (ProductList) context.getBean("products");
		
		// print the bean
		System.out.println(prods);
		System.out.println(prods.getProductNames().getClass());
	}
}
