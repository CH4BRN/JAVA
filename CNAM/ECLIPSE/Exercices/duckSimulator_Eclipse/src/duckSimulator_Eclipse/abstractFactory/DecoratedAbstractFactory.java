package duckSimulator_Eclipse.abstractFactory;

import duckSimulator_Eclipse.adapter.GooseAdapter;
import duckSimulator_Eclipse.decorator.Decorator;
import old.DuckCall;
import old.IQuackable;
import old.MallardDuck;
import old.RedheadDuck;
import old.RubberDuck;

public class DecoratedAbstractFactory implements IAbstractFactory{

	@Override
	public IQuackable CreateMallardDuck() {
		// TODO Auto-generated method stub
		return (Decorator)new Decorator(new MallardDuck());
	}

	@Override
	public IQuackable CreateDuckCall() {
		// TODO Auto-generated method stub
		return (Decorator)new Decorator(new DuckCall());
	}

	@Override
	public IQuackable CreateGoose() {
		// TODO Auto-generated method stub
		return (Decorator)new Decorator(new GooseAdapter());
	}

	@Override
	public IQuackable CreateRedheadDuck() {
		// TODO Auto-generated method stub
		return (Decorator)new Decorator(new RedheadDuck());
	}

	@Override
	public IQuackable CreateRubberDuck() {
		// TODO Auto-generated method stub
		return (Decorator)new Decorator(new RubberDuck());
	}

}
