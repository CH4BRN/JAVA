package duckSimulator_Eclipse.observer;

public class ConcreteObserver extends Observer{

	public static int quackCount = 0;
	@Override
	public void update(Object o)
	{
		super.update(o);
		quackCount++;
		System.out.println("\n" +o.getClass().getSimpleName() + " QC : " + quackCount);
		
	}
}
