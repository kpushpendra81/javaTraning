import java.util.Scanner;
 
class CurrentTime {
    public static void main (String [] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.println("This Program Displays The Time In The Specified Time Zone.\n");
         
        long totalMilliseconds = System.currentTimeMillis();
 
        long totalSeconds = totalMilliseconds / 1000;
 
        
        long currentSecond = totalSeconds % 60;
 
        
        long totalMinutes = totalSeconds / 60;
 
        
        long currentMinute = 30 + totalMinutes % 60;
 
        
        long totalHours = totalMinutes / 60;
 
        
        long currentHour = totalHours % 24;
         
        System.out.print(" Enter the time zone offset to GMT: " );

        long timeZone = input.nextLong();

        //long cu = (t < 6) ? (currentHour + 5) : (currentHour - 5 );

        //System.out.println(" Current time is " + cu + " : " + currentMinute + " : " + currentSecond + " GMT ");

        System.out.println(" Current time is " + (currentHour + (timeZone) ) + " : " + currentMinute + " : " + currentSecond + " GMT ");

       //System.out.println(" Current time is " + (currentHour + (timeZone)) + " : " + currentMinute + " : " + currentSecond + " GMT ");
        //System.out.println(cu);

        
       
    }
}