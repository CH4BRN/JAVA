 public class DisplayTest 
 {
	 public static void main(String[] args) 
	 {
		 int an = 2000;
		 
		 for (int i = 0; i <= 30; i++)
		 {
			 an = an +1;
			 System.out.println("Annee " + an + " " +  isBissextile(an));
		 }	
		 String line;
	 while((line = in.readLine()) != null)
		 {
			 System.out.println("ahah");
		 }		 
	 }
	 
	 private static boolean isBissextile(int an)
	 {
		 if((an %400 == 0)||((an %4 == 0)&&(an %100 != 0)))
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
	
	 }
 }