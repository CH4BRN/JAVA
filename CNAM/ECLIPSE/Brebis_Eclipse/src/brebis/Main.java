package brebis;

import brebis.observables.Camera;
import brebis.observers.Gendarme;
import brebis.observers.Paysan;

public class Main{
    
    public static void main(String[] args){
        
    	//Two camera
        Camera cameraPortail = cameraFactory("Camera portail");
        Camera cameraBergerie = cameraFactory("Camera bergerie");
        //Two paysan
        Paysan paysan1 = paysanFactory("Paysan 1");
        Paysan paysan2 = paysanFactory("Paysan 2");
        //One cop
        Gendarme gendarme1 = gendarmeFactory("Gendarme 1");
        
        //Add observer to cameraPortail
        cameraPortail.addObserver(paysan1);
        cameraPortail.addObserver(paysan2);
        
        //Add observer to cameraBergerie
        cameraBergerie.addObserver(paysan1);
        cameraBergerie.addObserver(paysan2);
        cameraBergerie.addObserver(gendarme1);
        
        // ici, n'oubliez pas d'associer les observateurs aux observables
        
        cameraPortail.detecte("Un loup a franchi le portail");
        cameraBergerie.detecte("Un loup est entré dans la bergerie");
        
        
    }
    
    public static Camera cameraFactory(String name)
    {
    	return new Camera(name);
    }
    
    public static Paysan paysanFactory(String name)
    {
    	return new Paysan(name);
    }
    
    public static Gendarme gendarmeFactory(String name)
    {
    	return new Gendarme(name);
    }
}
