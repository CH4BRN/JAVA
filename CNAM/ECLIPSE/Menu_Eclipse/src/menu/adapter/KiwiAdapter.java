package menu.adapter;

import menu.contracts.Aliment;
import menu.model.Kiwi;

public class KiwiAdapter implements Aliment {
	Kiwi kiwi = new Kiwi();
	

	@Override
	public void cuisiner() {
		// TODO Auto-generated method stub
		kiwi.eplucher();
	}
	

}
