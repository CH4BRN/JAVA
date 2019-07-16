package memento.observer;

import java.util.ArrayList;
import java.util.List;

import memento.model.Memento;

public class MementoObserver implements IObserver {


	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		mementos.add(new Memento(state));
	}
	
	public static List<Memento> mementos = new ArrayList<Memento>();

}
