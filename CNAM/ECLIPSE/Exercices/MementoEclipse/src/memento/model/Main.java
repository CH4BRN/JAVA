package memento.model;

import memento.adapter.ObservableAdapter;
import memento.observer.MementoObserver;

public class Main {

	public static void main(String[] args) {
	
		//Instantiates a new ObservableAdapter with a composite originator.
		ObservableAdapter ori = new ObservableAdapter(new Originator());
		//Add an observer that save memento
		ori.addObserver(new MementoObserver());
		
		ori.setState("state A");
		System.out.println("state 1 : " + ori.getState());
		
		ori.setState("State B");
		System.out.println("state 2 : " +ori.getState());
		
		ori.RestoreMemento(MementoObserver.mementos.get(0));
		
		System.out.println("state 3 : " +ori.getState());
	}
	
	

}
