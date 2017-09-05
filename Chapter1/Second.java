
import java.util.Scanner;

class Second
{
	
     public static void main(String[] args){ 
   

   	    Scanner input = new Scanner (System.in);
   	

   	    System.out.print("Please input the Numer = ");
        int seconds = input.nextInt();

        int mintutes = seconds / 60;
        int reseconds = seconds % 60;

   	
   	    System.out.println( seconds + " Seconds is " + mintutes + " mintutes and " + reseconds + " Seconds");


 
   }


}