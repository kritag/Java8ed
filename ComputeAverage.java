import java.util.Scanner;

public class ComputeAverage {
  public static void main(String[] args) {
    //Creates a new scanner object
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 3 numbers to compute average:");
    double n1=input.nextDouble();
    double n2=input.nextDouble();
    double n3=input.nextDouble();

    double av = (n1 + n2 + n3) / 3;
    System.out.println("The average is: " + av);

  }
}