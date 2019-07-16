package arrayListIterator.Iterators;

import arrayListIterator.aggregates.ArrayAggregate;
import arrayListIterator.contracts.IReverseIterator;

public class ArrayAggregateReverseIterator implements IReverseIterator{
    /** L'aggrégat parcouru par cet itérateur **/
    private ArrayAggregate aa;
    
    /** Index courant de l'itération **/
    private int index;
    
    public ArrayAggregateReverseIterator(ArrayAggregate aa){
        this.aa = aa;
        this.index = aa.data.length;
    }
    
    /** 
        Renvoie l'élément courant et avance la position de l'itération
    **/
    public Object next() {
        index--;
        return aa.data[index];
    }
    
    /** 
        Indique s'il reste des éléments à parcourir
    **/
    public boolean hasNext() {
        return index > 0;
    }
}
