import java.util.Scanner;

public class Exercise2_5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter subtotal: ");
    double subtotal = input.nextDouble();

    System.out.println("Please enter gratuity rate as an integer in %: ");
    int gratuity = input.nextInt();

    double actualGratuity = (gratuity / 100.0) * subtotal;
    double total = (int)((subtotal + actualGratuity) * 100) / 100.0;

    System.out.println("The gratuity is " + actualGratuity + " and the total is " + total);
  }
}