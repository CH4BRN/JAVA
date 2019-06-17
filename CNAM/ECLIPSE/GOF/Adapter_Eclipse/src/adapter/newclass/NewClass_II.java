package adapter.newclass;

import adapter.ExistingClass;
import adapter.contracts.IRequired;

/**Class that use Inheritance sa an adpater.
 * @author pierre.antoine
 *
 */
public class NewClass_II extends ExistingClass implements IRequired{

	@Override
	public void requiredMethod() {
		// TODO Auto-generated method stub
		super.usefulMethod();
	}

}
