import java.util.Scanner;

class ThreeIntergers{
	
		   public static void main(String[] args) {
	
			           Scanner input = new Scanner(System.in);

			           System.out.print("Please input first integer : ");
			           int a = input.nextInt();
			           
			           System.out.print("Please input Second integer : ");
			           int b = input.nextInt();

			           System.out.print("Please input Third integer : ");
			           int c = input.nextInt();

			           if ((a > b && a > c)){
			        
			            if(b > c){
			            
			                System.out.print(c + " " + b + " " + a);
			            }

			            else
			                System.out.print(b + " " + c + " " + a);

			            }
				        else if ((b > a && b > c)){
				        
				            if(a > c){
				            
				                System.out.print(c + " " + a + " " + b);
				            }
				            else
				                {
				                System.out.print(a + " " + c + " " + b);
				                }
				        }
				        else if ((c > a && c > b)){
				        
				            if(a > b)
				            {
				                System.out.print(b + " " + a + " " + c);
				            }
				            else
				                System.out.print(a + " " + b + " " + c);
				        }
				        else
				        {
				            System.out.println("Error");
				        }

    

    }



}