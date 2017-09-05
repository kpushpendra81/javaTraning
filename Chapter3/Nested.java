import java.util.Scanner;

class Nested{
	
			public static void main(String[] args) {
				
             Scanner input = new Scanner(System.in);

             System.out.print("Please input the i :  ");

             int i = input.nextInt();

             System.out.print("Please input the j :  ");

             int j = input.nextInt();
              
             System.out.print("Please input the k :  ");

             int k = input.nextInt();

             if (i > k) {

             	if (j > k)

             	System.out.print(" i and j are greater than k :"+ j);              	
             }

            else {
            	System.out.print("i and j less than to k : " + k);
            }


			  } 

}
