class Population
{
	
   public static void main(String[] args) 
   {

   	double b = (365 * 24 * 60 * 60)/ 7;

      double d = (365 * 24 * 60 * 60)/ 13;

      double im = (365 * 24 * 60 * 60)/ 45;

      double population = 312032486;

      double P = population + b - d + im; 
   	
   	System.out.println("first year = " + P);

      double PP = P + b - d + im;

      System.out.println("Second year = " + PP);

      double PPP = PP + b - d + im;
    
   	System.out.println("Third years =" + PPP);

      double PPPP= PPP+ b - d + im;

      System.out.println("Fourth =" + PPPP);

      double PPPPP= PPPP+ b - d + im;
   
   	System.out.println("Five Years = " + PPPPP);
 
   }


}