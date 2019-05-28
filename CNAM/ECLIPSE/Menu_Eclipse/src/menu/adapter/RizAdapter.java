package menu.adapter;

import menu.contracts.Aliment;
import menu.model.Riz;

public class RizAdapter implements Aliment{

	Riz riz = new Riz();
	@Override
	public void cuisiner() {
		// TODO Auto-generated method stub
		riz.faireCuire();
	}

}
