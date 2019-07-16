package testObserver.domain.aggregates.entities;

import testObserver.applicationservices.contracts.Observer;

/** Concrete Observer.
 * @author pierre.antoine
 *
 */
public class technician extends Observer{
	public String name;
	
	


	public technician(String name)
	{
		this.name = name;
	}
}
