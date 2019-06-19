package old;

import duckSimulator_Eclipse.Simulators.ASimulator;
import duckSimulator_Eclipse.decorator.Decorator;

public class DuckSimulator extends ASimulator {
    
    public void baseSimulate(){
    	System.out.println("\n=="+ this.getClass().getSimpleName() + " BASE SIMULATE ==");
		IQuackable mallardDuck = new MallardDuck();
		IQuackable redheadDuck = new RedheadDuck();
		IQuackable duckCall = new DuckCall();
		IQuackable rubberDuck = new RubberDuck();
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
	}
    
    public void decoratorSimulate() {
    	System.out.println("\n=="+ this.getClass().getSimpleName() + " DECORATOR SIMULATE ==");
    	Decorator deco1 = new Decorator(new MallardDuck());
    	Decorator deco2 = new Decorator(new RedheadDuck());
    	Decorator deco3 = new Decorator(new RubberDuck());
    	Decorator deco4 = new Decorator(new DuckCall());
    	
    	deco1.quack();
    	deco2.quack();
    	deco3.quack();
    	deco4.quack();
    	Decorator.Print();
    }
   

	public void simulation(int i) {
		// TODO Auto-generated method stub
		if(i<1)
		{
			baseSimulate();
		}
		else
		{
			decoratorSimulate();
		}
	
	}
}
