import java.util.Scanner;

public class Years
{
   public static void main(String[] args) 

    {
       Scanner input = new Scanner (System.in);
       int daysInyear = 365;
       System.out.println(" Enter the minutes: ");
       int minute = input.nextInt();
       int year = ((minute /60) / 24) / daysInyear;
       int day = ((minute /60) / 24) % daysInyear;

       System.out.println( minute + " equates to " + year + " years and " + day + " days ");






        input.close();
    }  	





}