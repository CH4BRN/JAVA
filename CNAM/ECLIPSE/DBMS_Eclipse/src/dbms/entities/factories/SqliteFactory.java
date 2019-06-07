package dbms.entities.factories;

import dbms.contracts.AConnection;
import dbms.contracts.AFactory;
import dbms.contracts.AQuery;
import dbms.entities.connections.SqliteConnection;
import dbms.entities.queries.SqliteQuery;
/** Concrete factory **/
public class SqliteFactory extends AFactory{

	@Override
	public AConnection createConnection() {

		return new SqliteConnection();
	}

	@Override
	public AQuery createQuery() {

		return new SqliteQuery();
	}

}
