package timestamp;

public class test {
	public static void main(String[] args) 
   {
		int total=0;
		
	 for(int i = 1 ; i<28 ; i++)
	 {
		 total = (int) (total + Math.pow(2, i));

	 }

	 int fplos = 1 << 1;
     for (int i = 1; i < 27; i++)
     {
         fplos |= fplos << 1;
     }

     
	 System.out.print(fplos);
   }
}
