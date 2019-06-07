package apiculture.abeille;

import apiculture.ruche.CelluleMale;
import apiculture.ruche.CelluleOuvriere;
import apiculture.ruche.CelluleRoyale;
import apiculture.ruche.Node;

/** Visiteur concret **/
public class Ventileuse extends Abeille {

	public Ventileuse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void visit(CelluleMale m) {
		// TODO Auto-generated method stub
		System.out.println("Visite de " + m.getName() + " par " + this.getName());
	}

	@Override
	public void visit(CelluleOuvriere o) {
		// TODO Auto-generated method stub
		System.out.println("Visite de " + o.getName() + " par " + this.getName());
	}

	@Override
	public void visit(CelluleRoyale r) {
		// TODO Auto-generated method stub
		System.out.println("Visite de " + r.getName() + " par " + this.getName());
	}

}
