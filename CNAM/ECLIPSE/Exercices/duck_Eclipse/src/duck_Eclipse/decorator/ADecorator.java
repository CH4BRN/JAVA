package duck_Eclipse.decorator;

import duck_Eclipse.contracts.IObserver;
import duck_Eclipse.contracts.IQuackable;

/**Decorator that use the Quackable interface as a common point between
 * the different ducks.
 * @author pierre.antoine
 *
 */
public class ADecorator implements IQuackable {

	/**Constructor. Instantiate.
	 * @param component
	 */
	public ADecorator(IQuackable component)
	{
		this.component = component;	
	}	
	
	/**Component that ensures that the decorator is able to do the same thing than a Quackable.
	 * 
	 */
	private IQuackable component;
	
	/**Quack count. Static, to be used by all the classes.
	 * 
	 */
	private static int count = 0;
	
	/**Get the quack count.
	 * @return
	 */
	public static int getCount()
	{
		return count;
	};

	/* Component quack + decorator action
	 * (non-Javadoc)
	 * @see duck_Eclipse.contracts.Quackable#quack()
	 */
	@Override
	public void quack() {
		
		
			count++;
		
		this.component.quack();
	}

	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}

}
