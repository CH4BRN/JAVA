package bibliotheque;

import bibliotheque.contracts.AComponent;
import bibliotheque.contracts.IComposite;
import bibliotheque.model.Etagere;
import bibliotheque.model.Livre;
import bibliotheque.model.Piece;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\nLIVRES : \n");	
		
		AComponent livre_0 = new Livre(10, "Mes Liserables et oim");
		AComponent livre_1 = new Livre(15, "Potre Name de Daris");
		AComponent livre_2 = new Livre(20, "Ma Letaphormose");
		AComponent livre_3 = new Livre(100, "Se leigneur nes ados");
		AComponent livre_4 = new Livre(34, "L'ydesso d'Ylusse");
		AComponent livre_5 = new Livre(245, "12 Disegn Pettarn");
				
		livre_0.print();
		livre_1.print();
		livre_2.print();
		livre_3.print();
		livre_4.print();
		livre_5.print();
		
		System.out.println("\n\nETAGERE : \n");
		
		AComponent etagere_O = new Etagere();
		etagere_O.addChild(livre_0);
		etagere_O.addChild(livre_1);
		etagere_O.addChild(livre_2);
		
		
		AComponent etagere_1 = new Etagere();
		etagere_1.addChild(livre_3);
		etagere_1.addChild(livre_4);
		etagere_1.addChild(livre_5);
				
		etagere_O.print();
		etagere_1.print();
		
		System.out.println("\n\nPIECE : \n");
		
		AComponent piece_0 = new Piece();
		piece_0.addChild(etagere_O);
		piece_0.addChild(etagere_1);
		
		piece_0.print();
	
		
		
	}

}
