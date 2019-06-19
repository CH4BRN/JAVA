package duck_Eclipse.ducks;


import duck_Eclipse.contracts.IObserver;
import duck_Eclipse.contracts.IQuackable;

public class RedheadDuck implements IQuackable {
	public void quack() {
		System.out.println("Redhead Quack");
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
