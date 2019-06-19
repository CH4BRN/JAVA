package duck_Eclipse.ducks;

import java.util.ArrayList;
import java.util.List;

import duck_Eclipse.contracts.IObserver;
import duck_Eclipse.contracts.IQuackable;

public class Flock implements IQuackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		for (IQuackable quackable : children) {
			quackable.quack();
		}
	}
	
	public void add(IQuackable component)
	{
		this.children.add(component);
		
	}
	
	public IQuackable getChild(int i)
	{
		return this.children.get(i);
	}
	
	public List<IQuackable> children = new ArrayList<IQuackable>();

	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}

}
