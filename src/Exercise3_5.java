import java.util.Scanner;

public class Exercise3_5{
  public static void main(String[] args) {
    int rand1 = (int)(Math.random() * 10);
    int rand2 = (int)(Math.random() * 10);
    int rand3 = (int)(Math.random() * 10);
    int smallest = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the lowest of these 3 numbers: " + rand1 + ", " + rand2 + ", " + rand3);
    int ans = input.nextInt();

    if(rand1 < rand2 && rand1 < rand3){
      smallest = rand1;
    }
    else if (rand2 < rand1 && rand2 < rand3){
      smallest = rand2;
    }
    else{
      smallest = rand3;
    }
    System.out.println("You answered that " + ans + " is the lowest number. This is " + (smallest==ans));
  }
}