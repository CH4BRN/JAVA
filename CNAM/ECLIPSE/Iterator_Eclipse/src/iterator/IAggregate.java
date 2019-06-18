package iterator;

/** Aggrégat abstrait
 * @author pierre.antoine
 *
 */
public interface IAggregate {

	 public NormalIterator getNormalIterator();
	 
	 public ReverseIterator getReverseIterator();
}
