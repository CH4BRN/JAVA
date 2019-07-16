package arrayListIterator.aggregates;

import java.util.ArrayList;
import java.util.List;

import arrayListIterator.Iterators.ArrayListAggregateNormalIterator;
import arrayListIterator.Iterators.ArrayListAggregateReverseIterator;
import arrayListIterator.contracts.IAggregates;
import arrayListIterator.contracts.INormalIterator;
import arrayListIterator.contracts.IReverseIterator;

public class ArrayListAggregate implements IAggregates {

	public List<Object> data = new ArrayList<Object>();
	
	public  ArrayListAggregate(List<Object> list) {
		
		data = list;
	}
	
	/* Factory method
	 * (non-Javadoc)
	 * @see arrayListIterator.contracts.IAggregates#getNormalIterator()
	 */
	@Override
	public INormalIterator getNormalIterator() {
		// TODO Auto-generated method stub
		return new ArrayListAggregateNormalIterator(this);
	}

	/* Factory method
	 * (non-Javadoc)
	 * @see arrayListIterator.contracts.IAggregates#getReverseIterator()
	 */
	@Override
	public IReverseIterator getReverseIterator() {
		// TODO Auto-generated method stub
		return new ArrayListAggregateReverseIterator(this);
	}

}
