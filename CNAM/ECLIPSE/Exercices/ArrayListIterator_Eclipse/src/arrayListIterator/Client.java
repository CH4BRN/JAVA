package arrayListIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import arrayListIterator.aggregates.ArrayAggregate;
import arrayListIterator.aggregates.ArrayListAggregate;
import arrayListIterator.contracts.IAggregates;
import arrayListIterator.contracts.INormalIterator;
import arrayListIterator.contracts.IReverseIterator;

public class Client {
	 public static void main(String[] args) {
		
	       simulate_2();
	       
	    }
	 
	 public static void simulate_1()
	 {
		 //Arrange
		 IAggregates aa = new ArrayAggregate(new String[]{
		            "Objet 1",
		            "Objet 2",
		            "Objet 3",
		            "Objet 4",
		            "Objet 5",
		            "Objet 6",
		            "Objet 7",
		        });
		        //Act
		        System.out.println(" === Itération simple ===");
		        INormalIterator it1 = aa.getNormalIterator();
		        while(it1.hasNext()){
		            System.out.println(it1.next());
		        }
		        
		        System.out.println(" === Itération inverse ===");
		        IReverseIterator it2 = aa.getReverseIterator();
		        while(it2.hasNext()){
		            System.out.println(it2.next());
		        }
		        
		        System.out.println(" === Itérations simple et inverse ===");
		        INormalIterator it3 = aa.getNormalIterator();
		        IReverseIterator it4 = aa.getReverseIterator();
		        while(it3.hasNext() && it4.hasNext()){
		            System.out.println(it3.next() + " -- " + it4.next());
		        }
		        
	 }
	 
	 public static void simulate_2()
	 {
		 //Arrange
		 ArrayListAggregate aa = new ArrayListAggregate(new ArrayList<Object>());
			  
		 aa.data.add("Objet 1");
		 aa.data.add("Objet 2");
		 aa.data.add("Objet 3");
		 aa.data.add("Objet 4");
		 aa.data.add("Objet 5");
		 aa.data.add("Objet 6");
		 aa.data.add("Objet 7");
		 aa.data.add("Objet 8");
		 aa.data.add("Objet 9");
		 aa.data.add("Objet 10");
	
		 INormalIterator it1 = aa.getNormalIterator();
		 //Act
		 while(it1.hasNext()){
	            System.out.println(it1.next());
	        }
					 
		        System.out.println(" === Itération simple ===");
		       
		        
		        System.out.println(" === Itération inverse ===");
		        IReverseIterator it2 = aa.getReverseIterator();
		        while(it2.hasNext()){
		            System.out.println(it2.next());
		        }
		        
		        System.out.println(" === Itérations simple et inverse ===");
		        INormalIterator it3 = aa.getNormalIterator();
		        IReverseIterator it4 = aa.getReverseIterator();
		        while(it3.hasNext() && it4.hasNext()){
		            System.out.println(it3.next() + " -- " + it4.next());
		        }
		        
	 }
}
