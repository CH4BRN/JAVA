package apiculture.abeille;

import apiculture.ruche.CelluleMale;
import apiculture.ruche.CelluleOuvriere;
import apiculture.ruche.CelluleRoyale;
import apiculture.ruche.Node;

/** 
Visiteur concret
**/

public class Nourrice extends Abeille {

public Nourrice(String name){ super(name); }

public void visit(Node n){
	
	if(!n.getClass().getSimpleName().toString().equalsIgnoreCase("CelluleMale"))
	{
		System.out.println("Visite de "+ n.getName() + " par " + this.getName());
	}
}

@Override
public void visit(CelluleMale m) {
	// TODO Auto-generated method stub
	
}

@Override
public void visit(CelluleOuvriere o) {
	// TODO Auto-generated method stub
	System.out.println("Visite de "+ o.getName() + " par " + this.getName());
}

@Override
public void visit(CelluleRoyale r) {
	// TODO Auto-generated method stub
	System.out.println("Visite de "+ r.getName() + " par " + this.getName());
}

}
