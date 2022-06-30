package springdemos.selfpracspringjdbc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springdemos.selfpracspringjdbc.employee.dao.EmployeeDao;
import springdemos.selfpracspringjdbc.employee.dto.Employee;

public class SpringJDBCApp {
	private static EmployeeDao employeedao;
	public static void main(String[] args) {
		//Container
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemos/selfpracspringjdbc/config/config.xml");
		//Get 'jdbctemplate' bean
		JdbcTemplate jdbctemplate = (JdbcTemplate) context.getBean("jdbctemplate");
		//Get 'employeedao' bean
		EmployeeDao employeedao = (EmployeeDao) context.getBean("employeedao");
		createEmployee();
	}
	
	private static void createEmployee() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setAge(22);
		emp.setName("Jaideep Lalchandani");
		int result = employeedao.create(emp);
		System.out.println("Number of records inserted are: " + result);
	}
}
