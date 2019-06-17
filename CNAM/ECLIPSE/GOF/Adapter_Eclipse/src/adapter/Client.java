package adapter;

import adapter.contracts.IRequired;
import adapter.newclass.NewClass_I;
import adapter.newclass.NewClass_II;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IRequired newClass_I = new NewClass_I();
		newClass_I.requiredMethod();
		
		IRequired newClass_II = new NewClass_II();
		newClass_II.requiredMethod();
		
		
	}

}
