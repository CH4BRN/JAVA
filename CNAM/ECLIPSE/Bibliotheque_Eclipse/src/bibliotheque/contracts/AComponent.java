package bibliotheque.contracts;

public abstract class AComponent implements IComposite {
	public String name = "";
	
	public int nombreLivre = 0;
	
	public int nombrePages = 0;
	
	public void print() {
		System.out.println("nb livres = " + getNombreLivres());
		System.out.println("nb pages = " + getNombrePages());
	};
	
	public abstract int getNombreLivres();
	
	public abstract int getNombrePages();
	
	
	
	
	
	
	

}
