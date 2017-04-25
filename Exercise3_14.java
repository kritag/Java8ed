import java.util.Scanner;

public class Exercise3_14{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int diceRoll = (int)(Math.random() * 5) + 1;

    System.out.println("Guess the dice roll: ");
    int guess = input.nextInt();

    if(diceRoll == guess){
      System.out.println("Your guess was correct! The number was " + diceRoll);
    }
    else{
      System.out.println("You guessed wrong. The dice roll was " + diceRoll);
    }
  }
}