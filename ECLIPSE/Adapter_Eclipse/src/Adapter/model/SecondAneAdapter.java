package Adapter.model;

public class SecondAneAdapter implements Cheval{

	private Ane ane = new Ane();
	@Override
	public void hennir() {
		// TODO Auto-generated method stub
		ane.braire();
	}

}
