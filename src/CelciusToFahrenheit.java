import java.util.Scanner;

public class CelciusToFahrenheit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a value in celcius: ");
    double celcius = input.nextDouble();

    double fahrenheit = (9.0/5) * celcius + 32;
    System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
  }
}