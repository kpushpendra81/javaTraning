import java.util.Scanner;

 class FahrenheitToCelsius{
    
          public static void main(String[] args){

              Scanner input = new Scanner(System.in);

              System.out.print("Enter a degree in Fahrenheit:");

              double fahrenheit =input.nextDouble();

              double cel = (5.0/ 9)*(fahrenheit-32);

              System.out.println(" fahrenheit " + fahrenheit + " is " + cel + " in cel ");




          }


 }