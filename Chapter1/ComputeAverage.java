import java.util.Scanner;  // Scanner is in the java.util package


class ComputeAverage{

    public static void main(String[] args) {
   	
   	   Scanner input = new Scanner(System.in);

   	   System.out.print(" Enter the First numbers =");

   	   double number1 = input.nextDouble();

   	   System.out.print(" Enter the Second numbers =");
   	   double number2 = input.nextDouble();

   	   System.out.print(" Enter the third numbers =");
   	   double number3 = input.nextDouble();

   	   double average = (number1 + number2 + number3) / 3;

   	   System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

        

         }
  
}

