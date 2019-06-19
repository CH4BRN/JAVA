package duck_Eclipse.ducks;


import duck_Eclipse.contracts.IObserver;
import duck_Eclipse.contracts.IQuackable;

public class DuckCall implements IQuackable {
	public void quack() {
		System.out.println("DuckCall quack");
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
