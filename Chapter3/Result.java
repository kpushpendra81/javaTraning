import java.util.Scanner;

class Result{
	
          public static void main(String[] args) {

          	Scanner input = new Scanner(System.in);

          	System.out.print("Please input the score : ");

          	int score = input.nextInt();

          	if (score >= 90)

          		System.out.print(" Grade A ");

          	else if (score >= 80){

          	  System.out.print("Grade B ");
              }

          	else if (score >= 70) {
          	 
          	 System.out.print(" Grade C");

          	}   
          		
          	else if (score >= 60) {
          		
          		System.out.print("Grade D ");
          			
          		}	
          	else {

          		System.out.print("Grade F");
          		
          	}
		         	


	         }


}