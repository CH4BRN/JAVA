package arrayListIterator.Iterators;

import arrayListIterator.aggregates.ArrayAggregate;
import arrayListIterator.contracts.INormalIterator;

public class ArrayAggregateNormalIterator implements INormalIterator {
  /** L'aggrégat parcouru par cet itérateur **/
    private ArrayAggregate aa;
    
    /** Index courant de l'itération **/
    private int index;
    
    public ArrayAggregateNormalIterator(ArrayAggregate aa){
        this.aa = aa;
        this.index = -1;
    }
    
    /** 
        Renvoie l'élément courant et avance la position de l'itération
    **/
    public Object next() {
        index++;
        return aa.data[index];
    }
    
    /** 
        Indique s'il reste des éléments à parcourir
    **/
    public boolean hasNext() {
        return index < aa.data.length - 1;
    }
}
