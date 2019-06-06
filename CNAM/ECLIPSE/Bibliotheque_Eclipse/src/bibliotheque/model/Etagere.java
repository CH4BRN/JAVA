package bibliotheque.model;

import java.util.ArrayList;
import java.util.List;

import bibliotheque.contracts.AComponent;
import bibliotheque.contracts.IComposite;

//COMPOSITE
public class Etagere extends AComponent {

	/** Liste de livres **/
	private List<AComponent> children = new ArrayList<>();
	
	@Override
	public List<AComponent> getChildren() {

		return this.children;
	}

	@Override
	public void addChild(AComponent child) {

		this.children.add(child);
	}

	@Override
	public void print() {
		System.out.println("Nb livres = " + this.getNombreLivres());
		System.out.println("Nb pages = " + this.getNombrePages());		
	}

	@Override
	public int getNombreLivres() {

		
		return getChildren().size();
	}

	@Override
	public int getNombrePages() {

		int nbTotalPage = 0;

		for (AComponent aComponent : this.getChildren()) {
			nbTotalPage = nbTotalPage + aComponent.getNombrePages();
		}

		return nbTotalPage;
		}
}
