package duckSimulator_Eclipse.abstractFactory;

import duckSimulator_Eclipse.adapter.GooseAdapter;
import old.DuckCall;
import old.IQuackable;
import old.MallardDuck;
import old.RedheadDuck;
import old.RubberDuck;

public class NormalAbstractFactory implements IAbstractFactory {

	@Override
	public IQuackable CreateMallardDuck() {
		// TODO Auto-generated method stub
		return new MallardDuck();
	}

	@Override
	public IQuackable CreateDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}

	@Override
	public IQuackable CreateGoose() {
		// TODO Auto-generated method stub
		return new GooseAdapter();
	}

	@Override
	public IQuackable CreateRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck();
	}

	@Override
	public IQuackable CreateRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}

	
}
