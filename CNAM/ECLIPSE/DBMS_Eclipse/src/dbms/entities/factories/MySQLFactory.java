package dbms.entities.factories;

import dbms.contracts.AConnection;
import dbms.contracts.AFactory;
import dbms.contracts.AQuery;
import dbms.entities.connections.MySqlConnection;
import dbms.entities.queries.MySqlQuery;
/** Concrete factory **/
public class MySQLFactory extends AFactory {
	
	public AConnection createConnection() 
	{
		return new MySqlConnection();
	}
	
	public AQuery createQuery() {
		return new MySqlQuery();
	}

}
