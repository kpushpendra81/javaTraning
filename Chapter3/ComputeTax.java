import  java.util.Scanner;

class ComputeTax{

	  public static void main(String[] args) {

	  	Scanner input = new Scanner(System.in);

		System.out.print("(0 - single filer, 1 - married jointly or" + "Qualifying widow (er), 2 - married separately, 3 - head of " + "Household ) Enter the filing Status : ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income : ");

        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {

        	if (income <= 33950)

        	tax = income * 0.10; 
        		
        	else if (income <= 33950)

        	 tax = 8350 * 0.10 + (income - 8350) * 0.15;

        	else if (income <= 82250)

        		tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

        	else if (income <=171550)

                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

            else if (income <= 372950)

            	tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;

            else

            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;            	
 	
        }

         else if (status == 1) {  // compute tax for married file jointly or qualifying widow (er) 

        	if (income <= 82250)

        	tax = income * 0.10; 
        		
        	else if (income <= 33950)

        	 tax = 8350 * 0.10 + (income - 8350) * 0.15;

        	else if (income <= 82250)

        		tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

        	else if (income <=171550)

                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

            else if (income <= 372950)

            	tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;

            else

            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;            	
 	
        }
       

         else if (status == 2) {  // compute tax for married separately

         	
          if (income <= 171550)

        	tax = income * 0.10; 
        		
        	else if (income <= 33950)

        	 tax = 8350 * 0.10 + (income - 8350) * 0.15;

        	else if (income <= 82250)

        		tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

        	else if (income <=171550)

                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

            else if (income <= 372950)

            	tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;

            else

            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;            	
 	


          } 

         else if (status == 3) {  // compute tax for head of household
         	

         if (income <= 372950)

        	tax = income * 0.10; 
        		
        	else if (income <= 33950)

        	 tax = 8350 * 0.10 + (income - 8350) * 0.15;

        	else if (income <= 82250)

        		tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

        	else if (income <=171550)

                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

            else if (income <= 372950)

            	tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;

            else

            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;            	
 	
        	
         }

         else{

         	System.out.print("Error : invalid status");

         	System.exit(1);

         }

         System.out.print("Tax is " + (int) (tax * 100) / 100.0);



	     }
	
   
}