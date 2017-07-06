import java.util.Scanner;

public class Exercise4_2 {
  public static void main(String[] args){
    final int NUMBER_OF_QUESTIONS= 10;
    int correctCount = 0;
    int count = 0;
    Scanner input = new Scanner(System.in);
    long startTime = System.currentTimeMillis();
    String output = "";

    while(count < NUMBER_OF_QUESTIONS){
      //Generates the two random numbers between 1 and 15
      int number1 = (int)(Math.random() * 15);
      int number2 = (int)(Math.random() * 15);

      //Prompts the user for the addition question
      System.out.println("What is " + number1 + " + " + number2 + " ?");
      int answer = input.nextInt();

      if(number1 + number2 == answer) {
        System.out.println("You are correct!");
        correctCount++;
      }
      else{
        System.out.println("You answer is wrong, " + number1 + " + " + number2 + " should be " + (number1 + number2));

      }
      count++;

      output += "\n" + number1 + " + " + number2 + " = " + answer + ((number1 +
       number2 == answer) ? " correct" : " wrong");
    }
    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;

    System.out.println("The correct count is " + correctCount + "\n" + "Test time is " + totalTime/1000 + " seconds" + output );
  }
}
