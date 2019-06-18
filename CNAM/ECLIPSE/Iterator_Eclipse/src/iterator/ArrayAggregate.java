package iterator;

/** Aggrégats concrets et leurs iterateurs
 * @author pierre.antoine
 *
 */
public class ArrayAggregate implements IAggregate {

	private Object[] data;
	
	public ArrayAggregate(Object[] data)
	{
		this.data = data;
	}
	@Override
	public INormalIterator getNormalIterator() {
		// TODO Auto-generated method stub
		return new ArrayAggregateNormalIterator(this);
	}

	@Override
	public ReverseIterator getReverseIterator() {
		// TODO Auto-generated method stub
		return new ArrayAggregateReverseIterator(this);
	}

}
