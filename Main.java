package practiseProblemsDay34;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		MyConnection.connection();
		Manager.quryRunnur(new Employee());
	}

}
