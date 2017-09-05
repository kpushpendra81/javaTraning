import java.util.Scanner;

class Acceleration{
	
		    public static void main(String[] args) {
		    	
            Scanner input = new Scanner(System.in);

            System.out.print(" Please enter the starting velocity : ");

            float v1 = input.nextFloat();

            System.out.print(" Please input the ending velocity : ");

            float v0 = input.nextFloat();      

            System.out.print(" Please input the time : ");

            float t = input.nextFloa();

            double a = ( v1 - v0 ) / t ;

            System.out.print(" Your acceleration is : " + a );

 


		      }


}