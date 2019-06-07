package dessin;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dessin.carres.CarreCentre;
import dessin.carres.CarreDoubleBordure;
import dessin.carres.CarreMarqueMilieu;
import dessin.carres.CarreRondsCoins;
import dessin.carres.CarreSimple;
import dessin.contracts.IComponent;

public class Main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Dessin de carrés");
        JPanel contentPane = new DessinPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(contentPane);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
    
}

/** 
    Panel où les carrés sont dessinés
**/
class DessinPanel extends JPanel{
    
    public void paint(Graphics g){
        
        // au centre
        CarreSimple c1 = new CarreSimple(500, 500, 100);
        c1.component = new CarreRondsCoins(500, 500, 100);
        c1.component.component = new CarreDoubleBordure(500, 500, 100);
        c1.component.component.component = new CarreCentre(500, 500, 100);
        c1.component.component.component.component = new CarreMarqueMilieu(500, 500, 100);
        c1.draw(g);
        
        // en haut à gauche
        CarreSimple c2 = new CarreDoubleBordure(200, 200, 100);
        c2.component = new CarreRondsCoins(200, 200, 100);
        c2.component.component = new CarreMarqueMilieu(200, 200, 100);
        c2.draw(g);
        
        // en bas à gauche
        CarreDoubleBordure c3 = new CarreDoubleBordure(200, 800, 100);
        c3.component = new CarreCentre(200, 800, 100);
        c3.draw(g);
        
        // en haut à droite
        CarreRondsCoins c4 = new CarreRondsCoins(800, 200, 100);
        c4.component = new CarreMarqueMilieu(800, 200, 100);
        c4.draw(g);
        
        // en bas à droite
        CarreCentre c5 = new CarreCentre(800, 800, 100);
        c5.component = new CarreMarqueMilieu(800, 800, 100);
        c5.draw(g);
        

    	
    	
    }
}
