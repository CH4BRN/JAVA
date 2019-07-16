package arrayListIterator.Iterators;

import arrayListIterator.aggregates.ArrayListAggregate;
import arrayListIterator.contracts.IReverseIterator;

public class ArrayListAggregateReverseIterator implements IReverseIterator{

	private ArrayListAggregate ala;
	public  ArrayListAggregateReverseIterator(ArrayListAggregate ala) {
		this.ala = ala;
		index = (ala.data.size());
	}
	
	private int index;
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		 index--;
		 if(index < ala.data.size())
		 {
			 return ala.data.get(index);
		 }
		 
		 return null;
	        
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index > 0;
	}

}
