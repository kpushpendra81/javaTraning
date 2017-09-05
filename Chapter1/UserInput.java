
import java.util.Scanner;

class UserInput
{
	
   public static void main(String[] args) 
   {

   	Scanner input = new Scanner (System.in);
   	
   	System.out.print("Please input the Numer = ");
    int a = input.nextInt();

   	System.out.print("\nPlease input the Second Numer = ");
   	double b = input.nextDouble();

   	System.out.print("Please input the third Numer = ");
   	float c= input.nextFloat();

   	double D = a + b + c;

   	System.out.println("your addition is = " + D);


 
   }


}