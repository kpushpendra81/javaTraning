import java.util.Scanner;

class BodyMassIndex{
	
           public static void main(String[] args) {

		     	Scanner input = new Scanner(System.in);

		        System.out.print("Enter weight in pounds: ");
		        
		        double weight = input.nextDouble();

		        System.out.print("Enter height in inches:");

		        double height = input.nextDouble();

		        double weightInKilograms = weight * 0.45359237;

		        double heightInMeters = height * 0.0254;

		        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		        System.out.print(" BMI is " +  bmi );

		        if (bmi < 18.5) {

		        	System.out.print(" Underweight ");
		        	
		        }
		         else if (bmi < 25.0) {

		         	System.out.print(" Normal ");
		         	
		         }

		     	else if (bmi < 30) {

		     		System.out.print(" Overweight ");
		     		
		     	}
		         else
		         	System.out.print(" Obese ");


     }


}