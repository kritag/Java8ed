import java.util.Scanner;
import javax.swing.JOptionPane;


public class Exercise2_12{
  public static void main(String[] args) {
    /*Scanner input = new Scanner(System.in);

    System.out.println("Enter balance: ");
    double balance = input.nextDouble();

    System.out.println("Enter annual interest rate: ");
    double annualInterestRate = input.nextDouble();

    double interest = (int)(balance *(annualInterestRate / 1200)*100)/100.0;

    double newBalance = balance + interest;

    System.out.println("The interest is " + interest + " and the new balance is " + newBalance);
    */
    String balanceString = JOptionPane.showInputDialog("Enter balance: ");
    double balance = Double.parseDouble(balanceString);

    String annualInterestRateString = JOptionPane.showInputDialog("Enter annual interest rate: ");
    double annualInterestRate = Double.parseDouble(annualInterestRateString);

    double interest = (int)(balance *(annualInterestRate / 1200)*100)/100.0;
    double newBalance = balance + interest;


    String output = "The interest is " + interest + " and the new balance is " + newBalance;
    JOptionPane.showMessageDialog(null, output);
  }
}