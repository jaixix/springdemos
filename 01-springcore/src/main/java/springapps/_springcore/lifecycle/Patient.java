package springapps._springcore.lifecycle;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside ID Setter Method!");
	}
	
	public void hi() {
		System.out.println("Inside Hi Method!");
	}
	
	public void bye() {
		System.out.println("Inside Bye Method!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
