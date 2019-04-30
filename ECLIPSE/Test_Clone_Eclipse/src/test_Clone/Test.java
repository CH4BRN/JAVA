package test_Clone;

public class Test implements Cloneable {
	
	private String name;
	private int age;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Test test = (Test)super.clone();
		return test;
	}
	
	public Test(String pName, int pAge) {
		this.name = pName;
		this.age = pAge;
		
	}

}
