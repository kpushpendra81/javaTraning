import java.util.Scanner;

class Health{
	
           public static void main(String[] args) {   //  BMI = kg/m2

           	Scanner input = new Scanner(System.in);

           	System.out.print(" Please enter in Pounds : ");

           	double p = input.nextDouble();

           	double weight = p * 0.4535;

           	System.out.print(" Please enter height in inches : ");

           	double t = input.nextDouble();

           	double height = t * 0.0254;

           	double bmi = weight / (height * height);


           System.out.println(" Your BMI :" + bmi);



           }



}