package dbms.contracts;
/** Abstract product **/
public abstract class AConnection 
{	
	public String toString() 
	{
		return this.getClass().getSimpleName().toString();
	};
}
