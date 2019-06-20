package duckSimulator_Eclipse.observer;

import java.util.ArrayList;
import java.util.List;

import old.IQuackable;

public abstract class Observable implements IQuackable {
	public void attach(Observer o) {
		observers.add(o);
	};
	
	public void Notify() {
		for (Observer observer : observers) {
			System.out.print("\n" +this.getClass().getSimpleName() + " notify");
			observer.update(this);
		}
	};
	
	public List<Observer> observers = new ArrayList<Observer>();

	@Override
	public abstract void quack();

}
