import java.util.Scanner;

public class ComputeArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number for radius:");

    double radius = input.nextDouble();
    double area;

    area = radius * radius * 3.14;

    System.out.println("The area of a circle with radius "+radius+ " is " +area);
  }
}