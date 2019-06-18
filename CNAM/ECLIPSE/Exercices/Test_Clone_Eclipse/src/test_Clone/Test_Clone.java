package test_Clone;

public class Test_Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test("myName", 42);
		
		try {
			Test cloned = (Test)test.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
