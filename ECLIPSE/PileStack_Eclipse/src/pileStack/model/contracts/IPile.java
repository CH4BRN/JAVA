package pileStack.model.contracts;

public interface IPile<E> {
	public void empiler (E e);
	public E depiler();
	public boolean estVide();

}
