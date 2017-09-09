import java.util.Scanner;

class FutureDates{
	
      public static void main(String[] args) {
      	 
                Scanner input = new Scanner(System.in);

                System.out.print("Enter today's Day : ");

                int day = input.nextInt();

                System.out.print("Enter the number of days elapsed since today : ");

                int today = input.nextInt();

                int futureDay = (day + today) % 7;

                if (futureDay == 0 ) {

                	System.out.print("Sunday");
                	
                }
                
                else if (futureDay == 1 ) {

                	System.out.print("Monday");
                	
                }
                 
                 else if (futureDay == 2 ) {

                	System.out.print("Tuseday");
                	
                }

                else if (futureDay == 3 ) {

                	System.out.print("Wednesday");
                	
                }
                else if (futureDay == 4 ) {

                	System.out.print("Thursday");
                	
                }
                else if (futureDay == 5 ) {

                	System.out.print("Friday");
                	
                }
                else if (futureDay == 6 ) {

                	System.out.print("Saturday");
                	
                }
                





         }



}