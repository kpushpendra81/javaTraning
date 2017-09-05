import java.util.Scanner;

class QuadraticEquations{
	
           public static void main(String[] args) {

           	    Scanner input = new Scanner(System.in);

           	    System.out.print("Please input the value of a : ");

           	    double a = input.nextDouble();

                System.out.print("Please input the value of b : ");

           	    double b = input.nextDouble();
  
                System.out.print("Please input the value of c : ");

           	    double c = input.nextDouble();

           	    double d = b * b - 4 * a * c;

           	    double r1 = ( - b + Math.sqrt(d))/(2*a); 

           	    //(- b + (Math.pow(d, 0.5)) / 2 * a);

                double r2 = ( - b + Math.sqrt(d))/(2*a); 

                //(- b - (Math.pow(d, 0.5)) / 2 * a);

           	    System.out.print("The equation has two roots :" + r1 + " and " + r2);

             }

}