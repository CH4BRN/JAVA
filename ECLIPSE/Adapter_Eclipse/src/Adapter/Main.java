package Adapter;

import Adapter.model.AneAdapter;
import Adapter.model.Chetland;
import Adapter.model.Cheval;
import Adapter.model.SecondAneAdapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cheval[] chevaux = {
				new Chetland(),
				new AneAdapter(),
				new SecondAneAdapter()
				};
		for (Cheval cheval : chevaux) {
			cheval.hennir();
		}
		}

	}

