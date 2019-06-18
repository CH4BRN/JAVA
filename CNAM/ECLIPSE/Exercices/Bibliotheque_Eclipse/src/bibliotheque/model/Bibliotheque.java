package bibliotheque.model;

import java.util.List;

import bibliotheque.contracts.AComponent;
import bibliotheque.contracts.IComposite;

public class Bibliotheque extends AComponent implements IComposite{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Nb livres = " + getNombreLivres());
		System.out.println("Nb pages = " + getNombrePages());
	}

	@Override
	public int getNombreLivres() {
		// TODO Auto-generated method stub
		return this.getChildren().size();
	}

	@Override
	public int getNombrePages() {
		// TODO Auto-generated method stub
		int pages = 0;
		for (AComponent aComponent : children) {
			pages = pages + aComponent.getNombrePages();
		}
		return pages;
	}

	@Override
	public List<AComponent> getChildren() {
		// TODO Auto-generated method stub
		return this.children;
	}

	@Override
	public void addChild(AComponent child) {
		// TODO Auto-generated method stub
		this.getChildren().add(child);
	}

}
