import java.util.Scanner;

class Application{
	
         public static void main(String[] args) {
      	
          Scanner input = new Scanner(System.in);

          System.out.print(" Please enter the balanc : ");

          double balanc = input.nextDouble();

          System.out.print(" Please input the annual Interest Rate : ");

          double rate = input.nextDouble();

          double interest = balanc * ( rate / 1200);

          System.out.print(" Your interest rate is : " + interest);



             }


}