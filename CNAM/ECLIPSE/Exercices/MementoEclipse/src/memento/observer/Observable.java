package memento.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	
	public List<IObserver> children = new ArrayList<IObserver>();
	
	public void Notify(String state)
	{
		for (IObserver iObserver : children) {
			iObserver.update(state);
			}
	}
	
	public void addObserver(IObserver o)
	{
		children.add(o);
	}

}
