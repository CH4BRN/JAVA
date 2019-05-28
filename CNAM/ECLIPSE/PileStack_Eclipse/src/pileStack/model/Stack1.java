package pileStack.model;

import pileStack.model.contracts.IStack;

public class Stack1<E> implements IStack<E>{

	E bidon;
	@Override
	public void push(E e) {
		 System.out.println("Stack1.push()");		
	}

	@Override
	public E pop() {
		System.out.println("Stack1.pop()");
        return bidon;
	}

	@Override
	public boolean isEmpty() {
		System.out.println("Stack1.isEmpty()");
        return false;
	}

}
