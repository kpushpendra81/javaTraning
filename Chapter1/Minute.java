
import java.util.Scanner;

class Minute
{
	
     public static void main(String[] args){ 
   

   	    Scanner input = new Scanner (System.in);
   	
   	    System.out.print("Please input the Numer = ");
        int mintutes = input.nextInt();

        int hour = mintutes / 60;
        int rmintues = mintutes % 60;
        

   	
   	    System.out.println( mintutes + " mintutes is " + hour + " hours and " + rmintues + " mintutes ");


 
   }


}