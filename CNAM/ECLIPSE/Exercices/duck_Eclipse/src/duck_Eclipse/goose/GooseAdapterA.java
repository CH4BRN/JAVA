package duck_Eclipse.goose;

import duck_Eclipse.contracts.IObserver;
import duck_Eclipse.contracts.IQuackable;

public class GooseAdapterA extends Goose implements IQuackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		this.honk();
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
