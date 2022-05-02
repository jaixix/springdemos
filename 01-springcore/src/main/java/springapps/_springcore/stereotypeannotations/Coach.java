package springapps._springcore.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // default bean name - "coach"; change bean name by - @Component("super-coach")
@Scope("prototype")
public class Coach {

	@Value("1")
	private int id;

	@Value("Jaideep")
	private String name;

	@Value("${dbUser}") // getting value from db.properties; use ${...}
	private String dbUser;

	@Value("#{topics}") // getting value from config.xml; use #{...}
	private List<String> topics;
	
	@Autowired
	private CoachProfile coachProfile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public CoachProfile getCoachProfile() {
		return coachProfile;
	}

	public void setCoachProfile(CoachProfile coachProfile) {
		this.coachProfile = coachProfile;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", dbUser=" + dbUser + ", topics=" + topics + ", coachProfile="
				+ coachProfile + "]";
	}

}
