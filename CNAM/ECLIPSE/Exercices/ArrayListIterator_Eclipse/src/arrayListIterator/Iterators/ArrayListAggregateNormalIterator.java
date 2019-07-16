package arrayListIterator.Iterators;

import arrayListIterator.aggregates.ArrayListAggregate;
import arrayListIterator.contracts.INormalIterator;

public class ArrayListAggregateNormalIterator implements INormalIterator {

	private ArrayListAggregate ala;
	public  ArrayListAggregateNormalIterator(ArrayListAggregate ala) {
		this.ala = ala;
		index = -1;
	}
	
	private int index;
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		 index++;
	        return ala.data.get(index);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		  return index < ala.data.size() - 1;
	}

}
