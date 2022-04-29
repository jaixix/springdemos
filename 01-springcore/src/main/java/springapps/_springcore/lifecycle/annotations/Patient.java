package springapps._springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside ID Setter Method!");
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside Hi (Initialize) Method!");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye (Destroy) Method!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
