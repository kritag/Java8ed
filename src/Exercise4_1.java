import java.util.Scanner;

public class Exercise4_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double total = 0;
    double average;
    int numPos = 0;
    int numNeg = 0;
    int count = 0;


    System.out.print("Enter an int value, the program exits if the input is 0: ");
    int number = input.nextInt();

    if(number == 0){
      System.out.println("No numbers are entered except 0, terminating");
      System.exit(1);
    }

    while (number != 0){
      if (number < 0) {
        numNeg++;
      }
      else
        numPos++;

      total += number;
      count++;
      number = input.nextInt();
    }

    average = total / count;

    System.out.println("The number of positives is " + numPos);
    System.out.println("The number of negatives is " + numNeg);
    System.out.println("The total is " + total);
    System.out.println("The average is " + (total / count));
  }
}
