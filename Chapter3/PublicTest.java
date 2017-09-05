import java.util.Scanner;

class PublicTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("x : ");
    double x = input.nextDouble();
    System.out.print("y : ");
    double y = input.nextDouble();
    System.out.print("z : ");
    double z = input.nextDouble();

    System.out.println((x < y && y < z));
    System.out.println((x < y || y < z));
    System.out.println(!(x < y));
    System.out.println((x + y < z));
    System.out.println((x + y > z));
  }
}
