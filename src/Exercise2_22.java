import java.util.Scanner;

public class Exercise2_22{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length of one side: ");
    double side = input.nextDouble();

    double area = 2*(1+Math.pow(2, 0.5))*Math.pow(side, 2);

    System.out.println("The area of the octagon is: " + area);

  }
}