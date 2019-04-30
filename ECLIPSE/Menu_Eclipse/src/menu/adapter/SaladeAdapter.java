package menu.adapter;

import menu.contracts.Aliment;
import menu.model.Salade;

public class SaladeAdapter implements Aliment{

	Salade salade = new Salade();
	@Override
	public void cuisiner() {
		// TODO Auto-generated method stub
		salade.preparer();
	}

}
