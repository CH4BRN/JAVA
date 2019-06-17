package adapter.newclass;


import adapter.ExistingClass;
import adapter.contracts.IRequired;

/**Class that use an interface as an adapter.
 * @author pierre.antoine
 *
 */
public class NewClass_I implements IRequired{

	private ExistingClass existingClass = new ExistingClass();
	@Override
	public void requiredMethod() {
		existingClass.usefulMethod();
		
	}

}