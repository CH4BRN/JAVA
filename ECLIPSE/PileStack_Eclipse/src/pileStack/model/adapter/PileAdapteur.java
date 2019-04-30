package pileStack.model.adapter;

import pileStack.model.Stack1;
import pileStack.model.contracts.IPile;

public class PileAdapteur<E> implements IPile<E>{
	
	Stack1<E> stack = new Stack1();

	@Override
	public void empiler(E e) {
		// TODO Auto-generated method stub
		stack.push(e);
	}

	@Override
	public E depiler() {
		// TODO Auto-generated method stub
		return stack.pop();
	}

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}



}


