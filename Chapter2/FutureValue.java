import java.util.Scanner;

class FutureValue{
	
        public static void main(String[] args) {
        	
        	Scanner input = new Scanner(System.in);

        	System.out.print(" Please enter the investment amount : ");

        	double amount = input.nextDouble();

            System.out.print(" Please enter the monthly intrest rate : ");

        	double rate = input.nextDouble();

        	double rt = rate/1200;

        	System.out.print(" Please enter the numbers of year : ");

        	double y = input.nextDouble();


        	double v = Math.pow((1 + rt), y*12);
            

            double futurevalue = amount * v;

            System.out.print(" Your future value =  " + futurevalue);

        }

}