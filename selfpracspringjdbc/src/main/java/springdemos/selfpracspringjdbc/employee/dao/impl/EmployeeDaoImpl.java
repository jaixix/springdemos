package springdemos.selfpracspringjdbc.employee.dao.impl;
import org.springframework.jdbc.core.JdbcTemplate;
import springdemos.selfpracspringjdbc.employee.dao.EmployeeDao;
import springdemos.selfpracspringjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getAge(), employee.getName());
		return result;
	}

}
