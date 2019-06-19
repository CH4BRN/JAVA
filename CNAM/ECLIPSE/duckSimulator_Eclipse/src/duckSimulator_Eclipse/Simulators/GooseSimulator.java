package duckSimulator_Eclipse.Simulators;

import duckSimulator_Eclipse.adapter.GooseAdapter;
import duckSimulator_Eclipse.decorator.Decorator;
import old.DuckCall;
import old.IQuackable;
import old.MallardDuck;
import old.RedheadDuck;
import old.RubberDuck;

public class GooseSimulator extends ASimulator{




	@Override
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
    public void baseSimulate(){
    	System.out.println("\n"+ this.getClass().getSimpleName() + "== BASE SIMULATE ==");
		IQuackable mallardGoose = new GooseAdapter();
		IQuackable redheadGoose = new GooseAdapter();
		IQuackable gooseCall = new GooseAdapter();
		IQuackable rubberGoose = new GooseAdapter();
 
		simulate(mallardGoose);
		simulate(redheadGoose);
		simulate(gooseCall);
		simulate(rubberGoose);
	}
    
    public void decoratorSimulate() {
    	System.out.println("\n"+ this.getClass().getSimpleName() + "== DECORATOR SIMULATE ==");
    	Decorator deco1 = new Decorator(new GooseAdapter());
    	Decorator deco2 = new Decorator(new GooseAdapter());
    	Decorator deco3 = new Decorator(new GooseAdapter());
    	Decorator deco4 = new Decorator(new GooseAdapter());
    	
    	deco1.quack();
    	deco2.quack();
    	deco3.quack();
    	deco4.quack();
    	Decorator.Print();
    }
}
