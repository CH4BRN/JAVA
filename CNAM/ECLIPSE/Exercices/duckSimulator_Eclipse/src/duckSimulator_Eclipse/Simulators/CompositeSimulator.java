package duckSimulator_Eclipse.Simulators;

import duckSimulator_Eclipse.abstractFactory.DecoratedAbstractFactory;
import duckSimulator_Eclipse.abstractFactory.IAbstractFactory;
import duckSimulator_Eclipse.abstractFactory.NormalAbstractFactory;
import duckSimulator_Eclipse.adapter.ComponentAdapter;
import duckSimulator_Eclipse.flock.Flock;
import old.IQuackable;
import old.MallardDuck;

public class CompositeSimulator extends ASimulator {

	IAbstractFactory normalFactory = new NormalAbstractFactory();
	
	IAbstractFactory decoratedFactory = new DecoratedAbstractFactory();
	@Override
	public void baseSimulate() {
		System.out.println("\n"+ this.getClass().getSimpleName() + " == BASE SIMULATE ==");
		// TODO Auto-generated method stub
		Flock f1 = new Flock();
		IQuackable mallardDuck = normalFactory.CreateMallardDuck();
		mallardDuck.quack();
		ComponentAdapter mallardAdapter = new ComponentAdapter(mallardDuck);
		mallardAdapter.quack();
		IQuackable redheadDuck = normalFactory.CreateRedheadDuck();
		ComponentAdapter redheadAdapter = new ComponentAdapter(redheadDuck);
		
		IQuackable rubberDuck = normalFactory.CreateRubberDuck();
		ComponentAdapter rubberAdapter = new ComponentAdapter(rubberDuck);
		
		IQuackable duckCall = normalFactory.CreateDuckCall();
		ComponentAdapter duckCallAdapter = new ComponentAdapter(duckCall);
		

		f1.add(mallardAdapter);
		f1.add(redheadAdapter);
		f1.add(rubberAdapter);
		f1.add(duckCallAdapter);
		
		ComponentAdapter m1 = new ComponentAdapter(normalFactory.CreateMallardDuck());
		ComponentAdapter m2 = new ComponentAdapter(normalFactory.CreateMallardDuck());
		ComponentAdapter m3 = new ComponentAdapter(normalFactory.CreateMallardDuck());
		ComponentAdapter m4 = new ComponentAdapter(normalFactory.CreateMallardDuck());
		
		
		Flock f2 = new Flock();
		f2.add(m1);
		f2.add(m2);
		f2.add(m3);
		f2.add(m4);
		
		Flock f3 = new Flock();
		f3.add(f1);
		f3.add(f2);
		
		f3.quack();
		
	}

	@Override
	public void decoratorSimulate() {
		// TODO Auto-generated method stub
		System.out.println("\n"+ this.getClass().getSimpleName() + " == DECORATOR SIMULATE ==");
		// TODO Auto-generated method stub
		Flock f1 = new Flock();
		IQuackable mallardDuck = decoratedFactory.CreateMallardDuck();
		mallardDuck.quack();
		ComponentAdapter mallardAdapter = new ComponentAdapter(mallardDuck);
		mallardAdapter.quack();
		IQuackable redheadDuck = decoratedFactory.CreateRedheadDuck();
		ComponentAdapter redheadAdapter = new ComponentAdapter(redheadDuck);
		
		IQuackable rubberDuck = decoratedFactory.CreateRubberDuck();
		ComponentAdapter rubberAdapter = new ComponentAdapter(rubberDuck);
		
		IQuackable duckCall = decoratedFactory.CreateDuckCall();
		ComponentAdapter duckCallAdapter = new ComponentAdapter(duckCall);
		

		f1.add(mallardAdapter);
		f1.add(redheadAdapter);
		f1.add(rubberAdapter);
		f1.add(duckCallAdapter);
		
		ComponentAdapter m1 = new ComponentAdapter(decoratedFactory.CreateMallardDuck());
		ComponentAdapter m2 = new ComponentAdapter(decoratedFactory.CreateMallardDuck());
		ComponentAdapter m3 = new ComponentAdapter(decoratedFactory.CreateMallardDuck());
		ComponentAdapter m4 = new ComponentAdapter(decoratedFactory.CreateMallardDuck());
		
		
		Flock f2 = new Flock();
		f2.add(m1);
		f2.add(m2);
		f2.add(m3);
		f2.add(m4);
		
		Flock f3 = new Flock();
		f3.add(f1);
		f3.add(f2);
		
		f3.quack();
		
	}

}
