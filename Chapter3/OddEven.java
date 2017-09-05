import java.util.Scanner;

class OddEven{
	
       public static void main(String[] args) {
    	 
    	 Scanner input = new Scanner(System.in);

    	 System.out.print("Please input the number : ");

    	  int number = input.nextInt();

    	  if (number % 2 == 0) {

    	  	System.out.print( number + " is Ever. ");

    	  }

          else {
          	System.out.print(number + " is Odd");

          }



          }

}