package duckSimulator_Eclipse.Simulators;

import old.IQuackable;

public abstract class ASimulator {

	public  void simulate(IQuackable bird) {
		bird.quack();
	};
	
	public void simulation(int i)
	{
		if(i>0)
		{
			decoratorSimulate();
		}
		else
		{
			baseSimulate();
		}
	};
	
	public abstract void baseSimulate();
	
	 public abstract  void decoratorSimulate();
}
