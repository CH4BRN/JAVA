package dbms.entities.factories;

import dbms.contracts.AConnection;
import dbms.contracts.AFactory;
import dbms.contracts.AQuery;
import dbms.entities.connections.PostgresqlConnection;
import dbms.entities.queries.PostgresqlQuery;
/** Concrete factory **/
public class PostgresqlFactory extends AFactory{

	@Override
	public AConnection createConnection() {
		
		return new PostgresqlConnection();
	}

	@Override
	public AQuery createQuery() {
		
		return new PostgresqlQuery();
	}

}
