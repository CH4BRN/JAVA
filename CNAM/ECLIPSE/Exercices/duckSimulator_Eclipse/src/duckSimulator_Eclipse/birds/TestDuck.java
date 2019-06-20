package duckSimulator_Eclipse.birds;

import duckSimulator_Eclipse.observer.Observable;


public class TestDuck extends Observable  {
	public void quack() {
		System.out.println("Test Quack");
		this.Notify();
	}
}
