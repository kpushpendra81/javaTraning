import java.util.Scanner;

class Volume{


	 public static void main(String[] args) {
	 	
         final float PI = (float) 3.14;

         double area;
         double volume;

         Scanner input = new Scanner(System.in);

         System.out.print(" Enter the redius : ");
         double redius = input.nextDouble();

         System.out.print(" Enter the Length : ");
         double length = input.nextDouble();

         area = redius * redius * PI;
         volume = area * length;

         System.out.println(" Your area is : " + area);

         System.out.println(" Your volume is : " + volume);

         
         
         



	 }
	

}