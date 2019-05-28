package pileStack;

import java.util.List;

import pileStack.model.adapter.PileAdapteur;
import pileStack.model.adapter.PileAdapteur2;
import pileStack.model.contracts.IPile;

public class Main {

	public static void main(String[] args) {

		TestCompositeAdapter();
		TestInheritanceAdapter();		
		
	}
	
	public static void TestCompositeAdapter()
	{
		
		System.out.print("\n== COMPOSITE ==\n");
		PileAdapteur<String> pileAdapteur = new PileAdapteur<String>();
		String aa = "AA";
		pileAdapteur.empiler(aa);
		pileAdapteur.depiler();
		pileAdapteur.estVide();
	}
	
	public static void TestInheritanceAdapter()
	{
		
		System.out.print("\n== INHERITANCE ==\n");
		PileAdapteur2<String> pileAdapteur = new PileAdapteur2<String>();
		String aa = "AA";
		pileAdapteur.empiler(aa);
		pileAdapteur.depiler();
		pileAdapteur.estVide();		
	}
	

}
