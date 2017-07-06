import java.util.Scanner;
 
public class Exercise2_16{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the amount of water in kilograms: ");
    double kilograms = input.nextDouble();

    System.out.println("Enter the initial temperature: ");
    double initTemp = input.nextDouble();

    System.out.println("Enter the final temperature: ");
    double endTemp = input.nextDouble();

    double energyNeeded = (kilograms * (endTemp - initTemp) * 4184);

    System.out.println("The energy needed is " + (float)energyNeeded);

  }
}