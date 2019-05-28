package pileStack.model.contracts;

public interface IStack<E> {
	public void push(E e);
    public E pop();
    public boolean isEmpty();

}
