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
                
                    
                    double r1 = ( - b + Math.pow(d, 0.5)) / (2 * a);

                    double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);

                    System.out.print("The equation has two roots : " + r1 + " and " + r2);

                 }
                else if(d == 0){
                
                    double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);

                    System.out.print("The equation has one root : " + r1);
                }

                else{
                
                    System.out.println("The equation has no real roots");
                }

    }

}