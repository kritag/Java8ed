import java.util.Scanner;

public class Exercise2_8{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter and ASCII code: ");
    int code = input.nextInt();

    char codeChar = (char)code;

    System.out.println("The character for ASCII code " + code + " is " + codeChar);
  }
}