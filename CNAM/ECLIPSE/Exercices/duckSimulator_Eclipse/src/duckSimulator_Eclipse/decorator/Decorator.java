package duckSimulator_Eclipse.decorator;

import old.IQuackable;

public class Decorator implements IQuackable {

	static int quackCount;
	public IQuackable duck;
	
	public static void Print()
	{
		System.out.print("Quack count = " + quackCount);
	}
	
	public Decorator (IQuackable bird)
	{
		this.duck = bird;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		quackCount++;
		this.duck.quack();
	}

}
