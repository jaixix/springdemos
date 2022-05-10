package springdemos._springhibernate.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import springdemos._springhibernate.product.dao.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public int create() {
		return 0;
	}

}
