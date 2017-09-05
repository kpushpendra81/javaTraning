import java.util.Scanner;

class Financial  {

	   public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);	
		

		
		   System.out.print("Enter the monthly saving amount: ");

		   double savingAmount = input.nextDouble();

		   Double MonthlyInterest = 0.00417;

		   double total = 100 * (1 + MonthlyInterest);
		
		   total = (100 + total) * (1 + MonthlyInterest);
		
		   total = (100 + total) * (1 + MonthlyInterest);
		
		   total = (100 + total) * (1 + MonthlyInterest);
		
		   total = (100 + total) * (1 + MonthlyInterest);
		
		   total = (100 + total) * (1 + MonthlyInterest);

		
		   System.out.println("After the sixth month total is : " + total);
	}
}
