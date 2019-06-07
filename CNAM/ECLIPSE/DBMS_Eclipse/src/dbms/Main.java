package dbms;

import dbms.contracts.AConnection;
import dbms.contracts.AQuery;
import dbms.entities.factories.AbstractFactory;
import dbms.entities.factories.MySQLFactory;
import dbms.entities.factories.PostgresqlFactory;
import dbms.entities.factories.SqliteFactory;

public class Main {

	public static void main(String[] args) {

		AFactory af1 = new MySQLFactory();
		AConnection aca = af1.createConnection();
		AQuery aqa = af1.createQuery();
		
		System.out.println("\n=== AbstractFactory 1 ===");
		System.out.println("    ProductA : " + aca.toString());
		System.out.println("    ProductB : " + aqa.toString());
		
		af1 = new SqliteFactory();
		aca = af1.createConnection();
		aqa = af1.createQuery();
		
		System.out.println("\n=== AbstractFactory 2 ===");
		System.out.println("    ProductA : " + aca.toString());
		System.out.println("    ProductB : " + aqa.toString());
		
		af1 = new PostgresqlFactory();
		aca = af1.createConnection();
		aqa = af1.createQuery();
		
		System.out.println("\n=== AbstractFactory 3 ===");
		System.out.println("    ProductA : " + aca.toString());
		System.out.println("    ProductB : " + aqa.toString());
		
		
		 
		 

	}

}
