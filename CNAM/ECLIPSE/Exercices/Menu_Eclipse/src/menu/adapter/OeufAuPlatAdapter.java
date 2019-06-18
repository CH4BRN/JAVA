package menu.adapter;

import menu.contracts.Aliment;
import menu.model.OeufAuPlat;

public class OeufAuPlatAdapter implements Aliment {

	OeufAuPlat oeufAuPlat = new OeufAuPlat();
	@Override
	public void cuisiner() {
		// TODO Auto-generated method stub
		oeufAuPlat.cuire();
	}

}
