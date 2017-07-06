import java.util.Scanner;

public class Exercise3_4{
  public static void main(String[] args) {
    int rand1 = (int)(Math.random() * 100);
    int rand2 = (int)(Math.random() * 100);

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the sum of " + rand1 + " + " + rand2 + " :");
    int ans = input.nextInt();
    System.out.println(rand1 + " + " + rand2 + " = " + ans + " is " + (rand1 + rand2 == ans));
  }
}