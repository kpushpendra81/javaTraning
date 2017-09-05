import java.util.Scanner;

class FeetToMeter{
	

      public static void main(String[] args) {

      	 Scanner input = new Scanner(System.in);

         System.out.print(" Please enter the feet : ");
      	 double feet = input.nextDouble();

      	 double meter = (feet * 0.305);

      	 System.out.println( feet +" feet is  " + meter + " meters ");

         }

}