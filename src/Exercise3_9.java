import java.util.Scanner;

public class Exercise3_9{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first 9 digits of ISBN number:");
    int number = input.nextInt();
    int checksum = (number / 100000000 % 10 * 1 + number / 10000000 % 10 * 2 +number / 1000000 % 10 * 3 +number / 100000 % 10 * 4 +number / 10000 % 10 * 5 +number / 1000 % 10 * 6 +number / 100 % 10 * 7 +number / 10 % 10 * 8 +number % 10 * 9 ) % 11;
    System.out.print("The ISBN number is: ");
    System.out.print(number);
    if(checksum == 10){
      System.out.print("X");
    }
    else {
      System.out.print(checksum);
    }
    System.out.println("\n");

  }
}