package spring_app4;

import java.sql.Connection;

public interface CommonDAO {
	public Connection connect();
	
	public void selectAll();
	
}
