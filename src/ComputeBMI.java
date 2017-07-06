import java.util.Scanner;

public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter weight in kgs: ");
    double weight = input.nextDouble();

    System.out.println("Enter height in meters: ");
    double height = input.nextDouble();

    double bmi = weight / (height * height);

    System.out.printf("Your BMI is %5.2f\n", bmi);
    if(bmi < 16)
      System.out.println("You are seriously underweight");
    else if (bmi < 18)
      System.out.println("You are underweight");
    else if (bmi < 24)
      System.out.println("You are normal weight");
    else if (bmi < 29)
      System.out.println("You are overweight");
    else if (bmi < 35)
      System.out.println("You are seriously overweight");
    else
      System.out.println("You are gravely overweight");
  }
}