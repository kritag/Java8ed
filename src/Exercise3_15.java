import java.util.Scanner;

public class Exercise3_15{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int randNum = (int)(Math.random() * 1000);
    System.out.println("Enter a 3-digit number: ");
    int guess = input.nextInt();

    //Extract digits
    int firstDigit = randNum/100;
    int remainingDigit = randNum % 100;
    int secondDigit = remainingDigit / 10;
    int thirdDigit = remainingDigit % 10;

    int guess1 = guess / 100;
    int guessRemain = guess % 100;
    int guess2 = guessRemain / 10;
    int guess3 = guessRemain % 10;

    System.out.println("The lottery number is " + randNum);

    if(guess == randNum){
      System.out.println("Congratulations, you win $10,000");
    }
    else if (guess1 ==)
  }
}