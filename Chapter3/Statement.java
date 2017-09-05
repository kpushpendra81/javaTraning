import java.util.Scanner;

class Statement{
	
    public static void main(String[] args) {
    	
      Scanner input = new Scanner(System.in);

      double PI = 3.14; 

      System.out.print(" Input the redius : ");

      double r = input.nextDouble();

           if (r >= 0 ) {
 
              double area = (PI * r * r);

              System.out.print("The area for the circle of radius " + r + " is " + area); 

            }

            else {
            	
            	System.out.print(" Negative input ");
            }



      }



}