package springdemos._springjdbc.employee.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springdemos._springjdbc.employee.dao.EmployeeDao;
import springdemos._springjdbc.employee.dto.Employee;

public class SpringJdbcApp {
	private static EmployeeDao employeedao;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemos/_springjdbc/config/config.xml");
		JdbcTemplate jdbctemplate = (JdbcTemplate) context.getBean("jdbctemplate");
		employeedao = (EmployeeDao) context.getBean("employeedao");
//		createEmployee();
//		updateEmployee();
//		deleteEmployee();
//		readEmployee();
//		readEmployees();
	}

	private static void createEmployee() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Max");
		emp.setLastName("Rider");
		int result = employeedao.create(emp);
		System.out.println("Number of records inserted are: " + result);
	}

	private static void updateEmployee() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("John");
		int result = employeedao.update(emp);
		System.out.println("Number of records updated are: " + result);
	}
	
	private static void deleteEmployee() {
		Employee emp = new Employee();
		emp.setId(2);
		int result = employeedao.delete(emp);
		System.out.println("Number of records deleted are: " + result);
	}
	
	private static void readEmployee() {
		Employee emp = employeedao.read(2);
		System.out.println(emp);
	}
	
	private static void readEmployees() {
		List<Employee> emps = employeedao.read();
		System.out.println(emps);
	}
}
