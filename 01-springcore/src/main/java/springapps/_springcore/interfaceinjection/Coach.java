package springapps._springcore.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coach {

	@Value("1")
	private int id;

	@Value("Jaideep")
	private String name;

	@Autowired
	@Qualifier("basketBall") // Since 2 beans implement Sport, mention @Qualifier("cricket") for cricket
	private Sport sport;

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sport=" + sport.play() + "]";
	}
}
