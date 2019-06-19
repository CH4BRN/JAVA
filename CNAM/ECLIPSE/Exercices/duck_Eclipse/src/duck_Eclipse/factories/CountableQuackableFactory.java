package duck_Eclipse.factories;

import duck_Eclipse.contracts.IAbstractFactory;
import duck_Eclipse.contracts.IQuackable;
import duck_Eclipse.decorator.ADecorator;
import duck_Eclipse.ducks.DuckCall;
import duck_Eclipse.ducks.MallardDuck;
import duck_Eclipse.ducks.RedheadDuck;
import duck_Eclipse.ducks.RubberDuck;
import duck_Eclipse.goose.GooseAdapterA;

public class CountableQuackableFactory implements IAbstractFactory {

	@Override
	public IQuackable CreateMallardDuck() {
			return new ADecorator(new MallardDuck());
	}

	@Override
	public IQuackable CreateDuckCall() {
		return new ADecorator(new DuckCall());
	}

	@Override
	public IQuackable CreateGoose() {
		return new ADecorator(new GooseAdapterA());
	}

	@Override
	public IQuackable CreateRedheadDuck() {
		return new ADecorator(new RedheadDuck());
	}

	@Override
	public IQuackable CreateRubberDuck() {
		// TODO Auto-generated method stub
		return new ADecorator(new RubberDuck());
	}

}
