import java.util.Scanner;

class Age{
	
        public static void main(String[] args) {
      	
		       Scanner input = new Scanner(System.in);

		       System.out.print(" Pleas input the Age : ");

		       int age = input.nextInt();

		       if (age < 16 ) {
		        
		          System.out.print("Cannot get a driver's license");

		       }

		       else {
		       	  System.out.print("Can get a driver's license ");
		       }




      }




}