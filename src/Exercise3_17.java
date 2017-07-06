import java.util.Scanner;

public class Exercise3_17{
  public static void main(String[] args) {
    int compRand = (int)(Math.random()*2);

    Scanner input = new Scanner(System.in);
    System.out.println("Scissor (0), rock (1), paper(2): ");
    int playerChoice = input.nextInt();

    switch(compRand) {
      case 0:
        System.out.print("Computer is scissor. ");
        break;
      case 1:
        System.out.print("Computer is rock. ");
        break;
      case 2:
        System.out.print("Computer is paper. ");
    }

    System.out.print("You are ");

    switch(playerChoice) {
      case 0:
        System.out.print(" scissor ");
        break;
      case 1:
        System.out.print(" rock ");
        break;
      case 2:
        System.out.print(" paper ");
        break;
    }
    if(playerChoice == compRand){
      System.out.print(" too. It's a draw.\n");
    }
    else {
      if((playerChoice == 0 && compRand == 2) || (playerChoice == 1 && compRand == 0) || (playerChoice == 2 && compRand == 1)){
        System.out.print(". You won!\n");
      }
      else{
        System.out.print(". You lose\n");
      }
    }
  }
}