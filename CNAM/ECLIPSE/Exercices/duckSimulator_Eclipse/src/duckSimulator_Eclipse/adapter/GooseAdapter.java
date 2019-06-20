package duckSimulator_Eclipse.adapter;

import duckSimulator_Eclipse.birds.Goose;
import old.IQuackable;

public class GooseAdapter implements IQuackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
	}
	
	Goose goose = new Goose();

}
