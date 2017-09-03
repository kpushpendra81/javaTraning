import java.util.Scanner;   //Scanneer is in java.util package

  public class ComputeAverge {
  	public static void main(String[] args){
       //Create a Scanner object
  		Scanner input = new Scanner(System.in);

  		//promt the user to enter three numbers
  		System.out.print("Enter first numbers: ");
  		double number1 = input.nextDouble();
      System.out.print("Enter second numbers: ");
  		double number2 = input.nextDouble();
      System.out.print("Enter third numbers: ");
  		double number3 = input.nextDouble();

  		  // Compute average
  		double average = (number1 + number2 + number3) / 3;

  		 //Display results
  		System.out.println("THe average of " + number1 + " " + number2 + " " + number3 + " is " + average);

  	}


  }