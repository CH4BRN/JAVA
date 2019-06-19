package duck_Eclipse.contracts;


/**Common point between all these ducks.
 * @author pierre.antoine
 *
 */
public interface IQuackable {
	/**Common method.
	 * 
	 */
	public abstract void quack();
	
	public void registerObserver(IObserver o);
	
	public void notifyObserver();
}
