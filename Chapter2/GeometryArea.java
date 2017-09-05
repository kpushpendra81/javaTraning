import java.util.Scanner;

class GeometryArea{
    
      public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);

        System.out.print(" Please enter the x1 :  "); 

        double x1 = input.nextDouble();

      System.out.print(" Please enter the y1 :  ");

      double y1 = input.nextDouble();

      System.out.print(" Please enter the x2 :  ");

      double x2 = input.nextDouble();

      System.out.print(" Please enter the y2 :  ");

      double y2 = input.nextDouble();

      System.out.print(" Please enter the x3 :  ");

      double x3 = input.nextDouble();

      System.out.print(" Please enter the y3 :  ");

      double y3 = input.nextDouble();

      double side1 = Math.pow( (x2*x2 + x1*x1- 2*x1*x2) + (y1*y1 + y2*y2 - 2*y1*y2), 0.5);

      double side2 = Math.pow( (x*x1 + x2*x2 - 2*x1*x2) + (y1*y1 + y2*y2 - 2*y1*y2), 0.5);  

      double side3 = Math.pow( (x*x1 + x2*x2 - 2*x1*x2) + (y1*y1 + y2*y2 - 2*y1*y2), 0.5);

      double s  = 1 / 2 * (side1 + side2 + side3);

      double area = Math.sqrt(s * (s - side1 ) * (s - side2 ) * (s - side3));
 
      System.out.print(" The area of the triangle is = " + area);








      }







}