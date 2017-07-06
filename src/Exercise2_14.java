import java.util.Scanner;

public class Exercise2_14{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double ONE_POUND = 0.45359237;
    final double ONE_INCH = 0.0254;

    System.out.println("Enter weight in pounds: ");
    double pounds = input.nextDouble();

    System.out.println("Enter height in inches: ");
    double inches = input.nextDouble();

    double bmi = (int)((pounds*ONE_POUND) / Math.pow(inches*ONE_INCH,2)*10000)/10000.0;

    System.out.println("BMI is " + bmi);
  }
}