import java.util.Scanner;

public class Exercise2_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the radius of the cylinder: ");
    double radius = input.nextDouble();

    System.out.println("Enter the length of the cylinder: ");
    double length = input.nextDouble();

    double area = (int)((radius * radius * Math.PI)*10000)/10000.0;
    double volume = (int)((length * area)*100)/100.0;
    System.out.println("The area of the cylinder is " + area + "\nand the volume is " + volume);
  }
}