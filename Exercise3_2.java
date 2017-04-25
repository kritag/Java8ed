import java.util.Scanner;

public class Exercise3_2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int number = input.nextInt();

    boolean num = (number % 2 == 0) ? false : true;
    System.out.println("The number is odd? " + num);
  }
}