import java.util.Scanner;

class Radius{


	    public static void main(String[] args) {
	    	
         Scanner input = new Scanner(System.in);

         System.out.print(" Please enter the Radius : ");

         double r = input.nextDouble();

         double PI = 3.14;

             if (r >= 0) {
         	
                    double area = (PI * r * r);

                    System.out.print("The area for the circle of radius " + r + " is = " + area);

                 }

	     }
           
}