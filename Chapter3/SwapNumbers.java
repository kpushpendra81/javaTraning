import java.util.Scanner;

class SwapNumbers{
	 
	     public static void main(String[] args) {
	     	
			     	Scanner input = new Scanner(System.in);

			     	int number1 = (int)(Math.random() * 10);

			     	int number2 = (int)(Math.random() * 10);

			     	if ( number1 < number2 ) {

			     		int temp = number1;

			     		number1 = number2;

			     		number2 = temp;
			     		
			     	}
                      
                      System.out.print("what is " + number1 + " - " + number2 + " ? ");

                      int answer = input.nextInt();

                      if (number1 - number2 == answer) {

                      	System.out.print("Your answer is correct !");
                      	
                      }

                      else {
                      	
                           System.out.print(" Your answer is wrong.  ");

                           System.out.print(number1 + " - " + number2 + " should be " + (number1 - number2));



                      }



	     }





}