import java.util.Scanner;

public class Exercise3_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a, b, c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    double discriminant = Math.pow(b, 2) - 4.0 * a * c;
    if(discriminant < 0.0) {
      System.out.println("The equation has no roots");
    }
    else if (discriminant == 0) {
      double r1 = (-b) / (2 * a);
      System.out.println("The root is " + r1);
    }
    else {
      double r1 = (-b + Math.pow(discriminant,0.5)) / (2 * a);
      double r2 = (-b - Math.pow(discriminant,0.5)) / (2 * a);
      System.out.println("The roots are " + r1 + " and " + r2);
    }
  }
}