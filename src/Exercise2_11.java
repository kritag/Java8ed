import java.util.Scanner;

public class Exercise2_11{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter employee's name: ");
    String name = input.next();

    System.out.println("Enter number of hours worked in a week (e.g., 10): ");
    double numHours = input.nextDouble();

    System.out.println("Enter hourly pay rate: ");
    double payRate = input.nextDouble();

    System.out.println("Enter federal tax withholding rate in decimal: ");
    double fedTax = input.nextDouble();

    System.out.println("Enter state tax withholding rate in decimal: ");
    double stateTax = input.nextDouble();

    double grossPay = payRate * numHours;

    double paidFedTax = fedTax * grossPay;
    double paidStateTax = stateTax * grossPay;

    double totalDeduction = paidStateTax + paidFedTax;
    double netPay = grossPay - totalDeduction;

    System.out.println("Employee name: " + name);
    System.out.println("Hours worked: " + numHours);
    System.out.println("Payrate : $" + payRate);
    System.out.println("Gross pay: $" + grossPay);
    System.out.println("Deductions: \n" +
      "\t" + "Federal withholding ("+ fedTax +"%): $" + paidFedTax + "\n" +
      "\t" + "State withholding ("+ stateTax +"%): $" + paidStateTax + "\n" +
      "\t" + "Total deduction: $" + totalDeduction);
    System.out.println("Net pay: $" + netPay);
  }
}