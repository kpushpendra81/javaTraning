import java.util.Scanner;

class Hexagon{
	
      public static void main(String[] args) {
      	
        Scanner input = new Scanner(System.in);

        System.out.print(" Please enter the side of a hexagon : ");

        double s = input.nextDouble();

        double area = 3 * Math.pow(3, 0.5) * (s * s) / 2;

         System.out.print(" The area of the hexagon is : " + area);

      }





}