package duck_Eclipse.factories;

import duck_Eclipse.contracts.IAbstractFactory;
import duck_Eclipse.contracts.IQuackable;
import duck_Eclipse.ducks.DuckCall;
import duck_Eclipse.ducks.MallardDuck;
import duck_Eclipse.ducks.RedheadDuck;
import duck_Eclipse.ducks.RubberDuck;
import duck_Eclipse.goose.GooseAdapterA;

public class QuackableFactory implements IAbstractFactory {

	public IQuackable CreateMallardDuck() {
		// TODO Auto-generated method stub
		return new MallardDuck();
	}

	public IQuackable CreateDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}

	public IQuackable CreateGoose() {
		// TODO Auto-generated method stub
		return new GooseAdapterA();
	}

	public IQuackable CreateRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck();
	}

	public IQuackable CreateRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}

}
