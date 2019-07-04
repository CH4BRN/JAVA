package old;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.print(interpret("un plus un"));
	}
	
	public static int interpret(String str){
	    switch(str){
	        case "un plus un" : return 2; 
	        case "un plus deux" : return 3; 
	        case "deux plus un" : return 3; 
	        // ...
	        case "neuf plus neuf" : return 18; 
	        // ...
	        case "un fois un" : return 1; 
	        case "un fois deux" : return 2;
	        case "deux fois un" : return 2;
	        // ...
	        case "neuf fois neuf" : return 81; 
	        default : return 0 ;	      
	    }
	}
	
	//GRAMMAR
	/*
	 * operation ::= 'plus' | 'fois'
	 * nombre ::= 'un'|'deux'| ... |'neuf'
	 *     expression ::= nombre operation nombre
	 */

}
