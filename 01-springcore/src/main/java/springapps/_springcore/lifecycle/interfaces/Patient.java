package springapps._springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside ID Setter Method!");
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	//destory method
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy Method!");
	}
	
//	intiliazing method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet Method!");
	}

}
