 import java.util.Scanner;

public class Time
{
	 public static void main(String[] args) 

       {
	      Scanner input = new Scanner(System.in);
	      System.out.println(" Enter the offset to GMT ");
          int offset = input.nextInt();
          long currentTimeInSeconds = System.currentTimeMillis() / 1000;
          long hour = (currentTimeInSeconds / 60) / 60; 
          long minute = (currentTimeInSeconds /60) % 60;
          long second = currentTimeInSeconds % 60;
          
          System.out.println("The current time is : " + (hour + offset) + ":" + (minute) + ":" + second + "East" );	



          input.close();

	   }


}