package springdemos.springboot.dao;

import org.springframework.stereotype.Component;

@Component
public class SampleDAO {
	public void create() {
		System.out.println("Inside Dao Package");
	}
}
