package duckSimulator_Eclipse.Simulators;

import duckSimulator_Eclipse.abstractFactory.*;
import duckSimulator_Eclipse.decorator.*;
import old.IQuackable;

public class FactorySimulator extends ASimulator {


	@Override
	public void simulate(IQuackable bird) {
		// TODO Auto-generated method stub
		bird.quack();
	}



	@Override
	public void simulation(int i) {
		// TODO Auto-generated method stub
		baseSimulate();
		decoratorSimulate();
	}

	


	@Override
	public void decoratorSimulate() {
		System.out.println("\n"+ this.getClass().getSimpleName() + "== DECORATOR SIMULATE ==");
		Decorator deco1 = (Decorator) abstractFactory.CreateMallardDuck();
		Decorator deco2 = (Decorator) abstractFactory.CreateRedheadDuck();
		Decorator deco3 = (Decorator) abstractFactory.CreateRubberDuck();
		Decorator deco4 = (Decorator) abstractFactory.CreateDuckCall();

    	deco1.quack();
    	deco2.quack();
    	deco3.quack();
    	deco4.quack();
    	Decorator.Print();
	
	
	}

	private IAbstractFactory normalFactory = new NormalAbstractFactory();

	private IAbstractFactory abstractFactory = new DecoratedAbstractFactory();

	@Override
	public void baseSimulate() {
		System.out.println("\n"+ this.getClass().getSimpleName() + "== BASE SIMULATE ==");
		IQuackable mallardDuck = normalFactory.CreateMallardDuck();
		IQuackable redheadDuck = normalFactory.CreateRedheadDuck();
		IQuackable duckCall = normalFactory.CreateDuckCall();
		IQuackable rubberDuck = normalFactory.CreateRubberDuck();
		IQuackable goose = normalFactory.CreateGoose();
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);
	}

}
