import java.util.Scanner;

class CelsiusToFahrenheit{


	 public static void main(String[] args) {
	 	
         Scanner input = new Scanner(System.in);

         System.out.print(" Enter the Celsius degree : ");

         double celsius = input.nextDouble();


         double fahrenheit = (9.0 / 5) * celsius + 32;

         System.out.println("Celsius To Fahrenheit is " + fahrenheit);



	 }
	

}