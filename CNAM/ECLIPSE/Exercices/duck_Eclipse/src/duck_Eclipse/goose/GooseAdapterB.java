package duck_Eclipse.goose;

import duck_Eclipse.contracts.IObserver;
import duck_Eclipse.contracts.IQuackable;

public class GooseAdapterB implements IQuackable{

	private Goose goose = new Goose();

	@Override
	public void quack() {
		this.goose.honk();
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
