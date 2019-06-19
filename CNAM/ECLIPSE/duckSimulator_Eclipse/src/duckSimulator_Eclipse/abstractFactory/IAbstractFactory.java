package duckSimulator_Eclipse.abstractFactory;

import old.IQuackable;

public interface IAbstractFactory {
	public  IQuackable CreateMallardDuck();
	public  IQuackable CreateDuckCall();
	public  IQuackable CreateGoose();
	public  IQuackable CreateRedheadDuck();
	public  IQuackable CreateRubberDuck();

	
}
