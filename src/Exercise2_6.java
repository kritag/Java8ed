import java.util.Scanner;

public class Exercise2_6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer between 100 and 999: ");
    int digit = input.nextInt();

    int right = digit % 10;


    int middle = digit / 10;
    int actualMiddle = middle %10;

    int left = digit / 100;

    int sum = right * actualMiddle * left;

    System.out.println("The product of the digits is " + sum);
  }
}