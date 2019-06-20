package duckSimulator_Eclipse.adapter;

import duckSimulator_Eclipse.observer.Observable;
import old.IQuackable;

public class ObservableAdapter extends Observable {

	
	public ObservableAdapter (IQuackable bird) {
		this.bird = bird;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		bird.quack();
		this.Notify();
	}

	public IQuackable bird;
	
	



}
