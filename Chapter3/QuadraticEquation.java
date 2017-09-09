import java.util.Scanner;

class QuadraticEquation{

      public static void main(String[] args){

      
                Scanner input = new Scanner(System.in);
            
                System.out.print("Please enter a = ");
                double a = input.nextDouble();

                System.out.print("Please enter b = ");
                double b = input.nextDouble();

                System.out.print("Please enter c = ");
                double c = input.nextDouble();

                double d = b * b - 4 * a * c;

                if(d > 0){
                
                    System.out.println("Roots are real and unequal");

                    double r1 = ( - b + Math.pow(d, 0.5)) / (2 * a);

                    double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);

                    System.out.print("First root is: " + r1);

                    System.out.print("Second root is: " + r2);
                 }
                else if(d == 0){
                
                    System.out.println("Roots are real and equal");

                    double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);

                    System.out.print("Root: " + r1);
                }

                else{
                
                    System.out.println("Roots are imaginary");
                }
    }
}