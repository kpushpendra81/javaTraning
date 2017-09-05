import  java.util.Scanner;

class Energy{
	
	     public static void main(String[] args) {
	     	
	     Scanner input = new Scanner(System.in);

	     System.out.print(" Enter the amount water in kilograms : ");

	     double m = input.nextDouble();

	     System.out.print(" Enter the initial temerature : ");

	     double it = input.nextDouble();

	     System.out.print(" Enter the final temerature : ");

	     double ft = input.nextDouble();

	     double q = m * ( ft - it ) * 4148;

	     System.out.print(" The Energy needed is " + q);
	       



         











	       }


}