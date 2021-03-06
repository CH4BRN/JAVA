package apiculture;

import apiculture.abeille.Abeille;
import apiculture.abeille.Nettoyeuse;
import apiculture.abeille.Nourrice;
import apiculture.abeille.Ventileuse;
import apiculture.ruche.CelluleMale;
import apiculture.ruche.CelluleOuvriere;
import apiculture.ruche.CelluleRoyale;
import apiculture.ruche.Node;
import apiculture.ruche.Rayon;
import apiculture.ruche.Ruche;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node ruche1 = new Ruche("Ruche n° 1");
		Node rayon1 = new Rayon("Rayon 1");
		Node cellule1_1 = new CelluleOuvriere("Cellule ouvrière 1_1");
		Node cellule1_2 = new CelluleMale("Cellule mâle 1_2");
		Node cellule1_3 = new CelluleOuvriere("Cellule ouvrière 1_3");
	    Node rayon2 = new Rayon("Rayon 2");
        Node cellule2_1 = new CelluleOuvriere("Cellule ouvrière 2_1");
        Node cellule2_2 = new CelluleOuvriere("Cellule ouvrière 2_2");
        Node cellule2_3 = new CelluleRoyale("Cellule royale 2_3");
        Node rayon3 = new Rayon("Rayon 3");
        Node cellule3_1 = new CelluleOuvriere("Cellule ouvrière 3_1");
        Node cellule3_2 = new CelluleOuvriere("Cellule ouvrière 3_2");
        Node cellule3_3 = new CelluleOuvriere("Cellule ouvrière 3_3");
        
        ruche1.addChild(rayon1);
        rayon1.addChild(cellule1_1);
        rayon1.addChild(cellule1_2);
        rayon1.addChild(cellule1_3);
        
        ruche1.addChild(rayon2);
        rayon2.addChild(cellule2_1);
        rayon2.addChild(cellule2_2);
        rayon2.addChild(cellule2_3);
        
        ruche1.addChild(rayon3);
        rayon3.addChild(cellule3_1);
        rayon3.addChild(cellule3_2);
        rayon3.addChild(cellule3_3);
        
        // création des visiteurs
        Abeille nettoyeuse1 = new Nettoyeuse("Nettoyeuse 1");
        Abeille nourrice1 = new Nourrice("Nourrice 1");
                
        Abeille nourrice2 = new Nourrice("Nourrice 2 ");
        
        Abeille ventileuse1 = new Ventileuse("Ventileuse 1");
        
        // action : entretien de la ruche
        System.out.println("=== Travail de nettoyeuse1 ===");
        ruche1.accept(nettoyeuse1);
        
        System.out.println("=== Travail de nourrice1 ===");
        ruche1.accept(nourrice1);
        
        System.out.println("=== Travail de nourrice2 ===");
        rayon2.accept(nourrice2);
        
        System.out.println("=== Travail de ventileuse 1 ===");
        ruche1.accept(ventileuse1);
        
        
        
	}

}
