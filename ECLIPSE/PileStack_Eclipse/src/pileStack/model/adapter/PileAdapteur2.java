package pileStack.model.adapter;

import pileStack.model.Stack1;
import pileStack.model.contracts.IPile;

public class PileAdapteur2<E> extends Stack1<E> implements IPile<E> {

	@Override
	public void empiler(E e) {
		// TODO Auto-generated method stub
		this.push(e);
	}

	@Override
	public E depiler() {
		// TODO Auto-generated method stub
		return this.pop();
	}

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return this.isEmpty();
	}

}
