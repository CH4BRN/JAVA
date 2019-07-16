package decorator;

public class Client {
	
	public void demo()
	{
		ConcreteComponent cd_1 = new ConcreteComponent(null, "00");
		ConcreteComponent cd_2 = new ConcreteComponent(cd_1, "11");
		ConcreteComponent cd_3 = new ConcreteComponent(cd_2, "22");
		
		cd_3.operation();
	}

}
