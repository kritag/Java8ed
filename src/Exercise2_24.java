import java.util.Scanner;

public class Exercise2_24{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter v and a: ");
    double v = input.nextDouble();
    double a = input.nextDouble();

    double formula = (Math.pow(v, 2)) / (2 * a);
    System.out.println("The average acceleration is: " + formula);

  }
}