package springapps._springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Creating Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springapps/_springcore/propertyplaceholder/config.xml");
		
		//Get the 'mydao' bean from the container (Defined in the config.xml  file)
		MyDAO mydao = (MyDAO) context.getBean("MyDAO");
		
		//Printing the Bean
		System.out.println(mydao);
	}
}
