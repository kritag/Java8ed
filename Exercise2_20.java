import java.util.Scanner;

public class Exercise2_20{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter x1 and y1: ");
    System.out.println("x1");
    double x1 = input.nextDouble();
    System.out.println("y1");
    double y1 = input.nextDouble();

    System.out.println("Enter x1 and y2: ");
    System.out.println("x2");
    double x2 = input.nextDouble();
    System.out.println("y2");
    double y2 = input.nextDouble();

    double together = Math.pow((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), 0.5);
    System.out.println("The distance between the two points is " + together);
  }
}