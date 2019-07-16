package testObserver.domain.aggregates.entities;

import testObserver.applicationservices.contracts.IComputer;
import testObserver.applicationservices.contracts.Observable;

/**Concrete subject (Observable)
 * @author pierre.antoine
 *
 */
public class computer extends Observable implements IComputer{
	public String name;

	@Override
	public String display() {
		this.Notify();
		return this.name;
	}
	
	public computer(String name)
	{
		this.name = name;
	}
	

}
