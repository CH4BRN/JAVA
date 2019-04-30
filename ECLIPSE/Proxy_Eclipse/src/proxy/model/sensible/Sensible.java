package proxy.model.sensible;

import proxy.model.contracts.ISensible;

class Sensible implements ISensible{
	  /** M�thode pouvant �tre ex�cut�e par ROOT, pas par ADMIN ni USER **/
    public  void rootMethod(String role){
        System.out.println("rootMethod called with role " + role);
    }
    
    /** M�thode pouvant �tre ex�cut�e par ADMIN et ROOT, pas par USER **/
    public  void adminMethod(String role){
        System.out.println("adminMethod called with role " + role);
    }
    
    /** M�thode pouvant �tre ex�cut�e par tout le monde (USER, ADMIN, ROOT) **/
    public  void userMethod(String role){
        System.out.println("userMethod called with role " + role);
    }

}
