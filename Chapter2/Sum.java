import java.util.Scanner;

class Sum {

      	public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print(" Pleas enter the number : ");

            int a = input.nextInt();


             int sum = a % 10;

                   a = a/10;

                 sum = sum + (a % 10);

                   a = a /10;

                 sum = sum + (a % 10);


             System.out.println(sum);
   












           	}	


}
