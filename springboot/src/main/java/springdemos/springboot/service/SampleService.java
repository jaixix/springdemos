package springdemos.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springdemos.springboot.dao.SampleDAO;

@Component
public class SampleService {
	@Autowired
	SampleDAO sampleDao;
	
	public void save() {
		System.out.println("Inside Service Package");
		sampleDao.create();
	}
}
