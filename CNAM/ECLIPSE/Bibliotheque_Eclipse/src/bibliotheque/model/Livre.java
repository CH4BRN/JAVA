package bibliotheque.model;

import java.util.List;

import bibliotheque.contracts.AComponent;
import bibliotheque.contracts.IComposite;
//LEAF
public class Livre extends AComponent {
	
	public Livre(int nbPages, String name)
	{
		this.nbPages = nbPages;
		this.name = name;
	}
	
	private int nbPages = 0;

	@Override
	public int getNombrePages() {
		// TODO Auto-generated method stub
		return this.nbPages;
		
	}

	@Override
	public int getNombreLivres() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	@Override
	public void print() {
		System.out.println(name + " \t - Nb pages = " + this.getNombrePages());		
	}

	@Override
	public List<AComponent> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addChild(AComponent child) {
		// TODO Auto-generated method stub
		
	}

}
