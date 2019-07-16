package arrayListIterator.aggregates;

import arrayListIterator.Iterators.ArrayAggregateNormalIterator;
import arrayListIterator.Iterators.ArrayAggregateReverseIterator;
import arrayListIterator.contracts.IAggregates;
import arrayListIterator.contracts.INormalIterator;
import arrayListIterator.contracts.IReverseIterator;

public class ArrayAggregate implements IAggregates{ 

	   public Object[] data;
	    
	    public ArrayAggregate(Object[] data){
	        this.data = data;
	    }
	    
	    /* 
	     * Factory method
	     * (non-Javadoc)
	     * @see arrayListIterator.contracts.IAggregates#getNormalIterator()
	     */
	    public INormalIterator getNormalIterator() {
	        return new ArrayAggregateNormalIterator(this);
	    }
	    
	    /* Factory method
	     * (non-Javadoc)
	     * @see arrayListIterator.contracts.IAggregates#getReverseIterator()
	     */
	    public IReverseIterator getReverseIterator() {
	        return new ArrayAggregateReverseIterator(this);
	    }
}
