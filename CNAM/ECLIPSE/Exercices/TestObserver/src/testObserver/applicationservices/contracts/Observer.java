package testObserver.applicationservices.contracts;

/**Abstract observer
 * @author pierre.antoine
 *
 */
public abstract class Observer {
	
	
	public String update(Object o)
	{
		return o.getClass().getSimpleName()+ " = ";
	};

}
