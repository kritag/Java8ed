import java.util.Scanner;

public class Exercise3_12{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int number = input.nextInt();

    if((number % 3 == 0) ^ (number % 4 == 0)){
      System.out.println(number + " is divisble by 3 or 4 but not both");
    }
    else if ((number % 3 == 0) && (number % 4 == 0)){
      System.out.println(number + " is divisble by both 3 and 4");
    }
    else {
      System.out.println(number + " is not divisible by either 3 or 4");
    }
  }
}