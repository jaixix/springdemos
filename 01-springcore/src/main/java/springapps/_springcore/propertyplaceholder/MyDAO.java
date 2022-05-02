package springapps._springcore.propertyplaceholder;

public class MyDAO {
	private String dbUrl;
	private String dbUser;
	private String dbPassword;

	public MyDAO(String dbUrl, String dbUser, String dbPassword) {
		this.dbUrl = dbUrl;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "MyDAO [dbUrl=" + dbUrl + ", dbUser=" + dbUser + ", dbPassword=" + dbPassword + "]";
	}
}
