class TruFalse{
	
      public static void main(String[] args) {
      
        int x = 1;

        boolean a = !(x > 0) && (x > 0);
        System.out.println(a);

	    boolean b = !(x > 0) && (x > 0);
        System.out.println(b);

        boolean c =(x > 0) || (x < 0);
        System.out.println(c);

	    boolean d = (x != 0) || (x == 0);
	    System.out.println(d);  

	    boolean e =(x >= 0) || (x < 0);
        System.out.println(e);  

    	boolean f =(x != 1) == !(x == 1);
        System.out.println(f);

      }




}