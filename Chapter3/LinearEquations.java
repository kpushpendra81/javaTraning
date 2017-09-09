import java.util.Scanner;

class LinearEquations{


			public static void main(String[] args) {

				Scanner input = new Scanner(System.in);

				System.out.print("a = ");
                double a = input.nextDouble(); 

                System.out.print("b = ");			    
			    double b = input.nextDouble();
			    System.out.print("c = ");
			    double c = input.nextDouble();
			    System.out.print("d = ");
			    double d = input.nextDouble();
			    System.out.print("e = ");
			    double e = input.nextDouble();
			    System.out.print("f = ");
			    double f = input.nextDouble();

			    double x = (e * d - b * f) / (a * d - b * c);
			    double y = (a * f - e * c) / (a * d - b * c);

			    System.out.print("x is = " + x );

			    System.out.print("y is = " + y);

      	      }

}