import java.util.Scanner;

class Wrong{

	    public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
   
        System.out.print("Please input the Scroe : ");

        int score = input.nextInt();

		if (score >= 60.0)
		  System.out.println("D");
		else if (score >= 70.0)
		  System.out.println("C");
		else if (score >= 80.0)
		  System.out.println("B");
		else if (score >= 90.0)
		  System.out.println("A");
		else
		  System.out.println("F");


   }

}