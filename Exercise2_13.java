import java.util.Scanner;

public class Exercise2_13{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter investment amount: ");
    double investmentAmount = input.nextDouble();

    System.out.println("Enter monthly interest rate: ");
    double monthlyInvestmentRate = input.nextDouble();
    monthlyInvestmentRate = monthlyInvestmentRate / 100.0;

    System.out.println("Enter number of years: ");
    int numberOfYears = input.nextInt();

    double futureInvestmentValue = investmentAmount * Math.pow(1.0 + monthlyInvestmentRate, numberOfYears * 12);

    System.out.println("Accumulated value is " + futureInvestmentValue);
  }
}