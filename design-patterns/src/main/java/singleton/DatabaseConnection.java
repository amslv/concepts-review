package singleton;

public class DatabaseConnection {
	
	private static String connected = null;
	
	public static String getConnection() {
		if (connected == null) {
			connected = "It works";
			return "Criando inst�ncia";
		}
		return "Utilizando inst�ncia previamente criada";
	}

}
