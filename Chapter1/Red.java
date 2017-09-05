class Red {
   	public static void main(String[] args) {
        int a = 3527;
        int b = a % 10;
        System.out.print(b);
        a = a / 10;
        b = b % 10;
        System.out.print(b);
        a = a / 10;
        b = a % 10;
        System.out.print(b);
        a = a / 10;
        System.out.print(a);
   	}	
}


