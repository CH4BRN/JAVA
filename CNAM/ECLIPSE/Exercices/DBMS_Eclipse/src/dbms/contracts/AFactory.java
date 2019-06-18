package dbms.contracts;

import dbms.contracts.AConnection;
import dbms.contracts.AQuery;
/** Abstract factory **/
public abstract class AFactory {
	
	/** Create Abstract product 1 **/
	public abstract AConnection createConnection() ;
	
	/** Create Abstract product 2 **/
	public abstract AQuery createQuery();
	
	
	
}


