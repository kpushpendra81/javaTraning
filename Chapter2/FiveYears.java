import java.util.Scanner;
class FiveYears
{
	
   public static void main(String[] args) 
   {

      Scanner input = new Scanner(System.in);

      System.out.print(" Pleas input the years : ");

      int y = input.nextInt();

      double b = (365 * 24 * 60 * 60 * y)/ 7;

      double d = (365 * 24 * 60 * 60 * y)/ 13;

      double im = (365 * 24 * 60 * 60 * y)/ 45;

      int population = 312032486;

      int p = (population + (int)b + (int)im) - (int)d; 

   	System.out.println("Five Years = " + p);
 
   }


}