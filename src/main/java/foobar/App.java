package foobar;

import org.flywaydb.core.Flyway;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyway flyway = new Flyway();
		
		flyway.setDataSource("jdbc:h2:file./target/foobar", "sa", null);
		
		flyway.migrate();
	}

}
