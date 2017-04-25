import java.util.Scanner;

public class Exercise2_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a integer value in centimeters: ");
    int centimeters = input.nextInt();

    double inches = centimeters*0.3937;
     System.out.println(+centimeters + " centimeters is " + inches + " in inches");

  }
}