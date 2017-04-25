import java.util.Scanner;

public class ComputeChange{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a decimal number: ");
    double amount = input.nextDouble();

    int cents = (int)(amount*100);
    System.out.println(cents);
    int numberOfDollars = cents /100;
    cents = cents%100;

    int numberOfQuarters = cents/25;
    cents=cents%25;
    System.out.println(numberOfQuarters);
    int numberOfDimes = cents/10;
    cents=cents%10;

    int numberOfNickels = cents /5;
    cents=cents%5;

    int numberOfPennies = cents;

    System.out.println("Your amount "+amount+" consists of: \n"+
      "\t"+numberOfDollars+ " dollars\n"+
      "\t"+numberOfQuarters+ " quarters\n"+
      "\t"+numberOfDimes+ " dimes\n"+
      "\t"+numberOfNickels+ " nickels\n"+
      "\t"+numberOfPennies+ " pennies\n");
  }
}