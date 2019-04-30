 public class DisplayTest 
 {
	 public static void main(String[] args) 
	 {
		 iloop: for(int i =0; i < 10; i++)
				{
					System.out.println("I = " + i);
					jloop: for (int j =0; j< 10 ; j++)
					{
						System.out.println("j = " + j);
						if(j == 5)
						{
							break iloop;
						}
					}
				}
	 }
 }