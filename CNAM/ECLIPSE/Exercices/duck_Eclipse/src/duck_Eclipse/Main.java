package duck_Eclipse;

import duck_Eclipse.contracts.IDuckSimulator;
import duck_Eclipse.factories.CountableQuackableFactory;
import duck_Eclipse.factories.QuackableFactory;


public class Main {
    
	private static IDuckSimulator duckSimulator;
	
	public static void setDuckSimulator(IDuckSimulator simulator)
	{
		duckSimulator = simulator;
	};
	public static void main(String[] args) {

	
		duckSimulator = new DuckSimulator(new QuackableFactory(), new CountableQuackableFactory());
		
		//duckSimulator.simulate();
		//duckSimulator.simulatedecorator();
		//duckSimulator.simulateFlock();
	    
	    }
}
