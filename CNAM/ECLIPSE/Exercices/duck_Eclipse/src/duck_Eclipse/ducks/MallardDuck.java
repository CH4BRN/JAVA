package duck_Eclipse.ducks;


import java.util.ArrayList;
import java.util.List;

import duck_Eclipse.contracts.IObserver;
import duck_Eclipse.contracts.IQuackable;

public class MallardDuck implements IQuackable{
	public void quack() {
		System.out.println("Mallard Quack");
	}
	
	public List<IObserver> list = new ArrayList<IObserver>();

	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}
}
