package menu;

import menu.adapter.KiwiAdapter;
import menu.adapter.OeufAuPlatAdapter;
import menu.adapter.RizAdapter;
import menu.adapter.SaladeAdapter;
import menu.contracts.Aliment;
import menu.model.Kiwi;
import menu.model.OeufAuPlat;
import menu.model.Riz;
import menu.model.Salade;

public class Main {

	public static void main(String[] args) {
		System.out.println("=== Préparation d'un repas ===");
        //preparerRepas1();
        preparerRepas();

	}
	
	  public static void preparerRepas1(){
	        Salade s = new Salade();
	        OeufAuPlat o = new OeufAuPlat();
	        Riz r = new Riz();
	        Kiwi k = new Kiwi();
	        
	        s.preparer();
	        o.cuire();
	        r.faireCuire();
	        k.eplucher();
	    }
	  
	  public static void preparerRepas()
	  {
		  Aliment s = new SaladeAdapter();
		  Aliment o = new OeufAuPlatAdapter();
		  Aliment r = new RizAdapter();
		  Aliment k = new KiwiAdapter();
		  
		  Aliment[] aliments = new Aliment[]
		  {
			  s, o, r, k
		  };
		  
		  for (Aliment a : aliments) {
			  a.cuisiner();
			
		}
	  }

}
