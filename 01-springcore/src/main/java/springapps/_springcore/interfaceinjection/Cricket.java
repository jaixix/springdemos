package springapps._springcore.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport{

	@Override
	public String play() {
		return "Playing Cricket";
	}
	
}
