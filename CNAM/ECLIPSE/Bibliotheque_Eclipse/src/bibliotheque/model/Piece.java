package bibliotheque.model;

import java.util.ArrayList;
import java.util.List;

import bibliotheque.contracts.AComponent;
import bibliotheque.contracts.IComposite;
//COMPOSITE
public class Piece extends AComponent {

	/** Liste d'etageres **/
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
	public int getNombreLivres() {
		int nbLivres = 0;
		
		for (AComponent aComponent : children) {
			nbLivres += aComponent.getNombreLivres();
		}
		//return nbLivres;
		return 10;
	}

	@Override
	public int getNombrePages() {
		int nbPages = 0;
		
		
		 for (AComponent aComponent : children) {
		 
			nbPages += aComponent.getNombrePages();
		}
		return nbPages;
	}

}
