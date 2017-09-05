import java.util.Scanner;

class Minute{
	
         public static void main(String[] args) {
      	
            Scanner input = new Scanner(System.in);

            System.out.print(" Please Enter the minutes : ");
            int minutes = input.nextInt();

            int year = minutes / 525600 ;
            int day = (minutes % 525600) / 1440;
            int hours = ((minutes % 525600) % 1440) / 60;
            int minut = (((minutes % 525600) % 1440) % 60);
            


            System.out.println( minutes + " minutes is " + year + " years & "  +  day + " days "  +  hours + " Hours "  +  minut + " minutes ");


 


              }


}