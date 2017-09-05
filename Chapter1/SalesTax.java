import java.util.Scanner;

class SalesTax{

     	public static void main(String[] args ){

     		Scanner input = new Scanner(System.in);

     		System.out.println("Enter purchase amount: ");
     		double purchaseAmount = input.nextDouble();

     		double tax = purchaseAmount * 1.65;
     		System.out.println("Sales tax is $" + (int)(tax *100) / 100.00);











      }  

   }