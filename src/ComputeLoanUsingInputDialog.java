import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {
  public static void main(String[] args) {
    String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate, for example 8.25:");

    double annualInterestRate = Double.parseDouble(annualInterestRateString);
    double monthlyInterestRate = annualInterestRate / 1200;

    String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years as an integer, \nfor exampe 5: ");

    int numberOfYears = Integer.parseInt(numberOfYearsString);

    String loanString = JOptionPane.showInputDialog("Enter loan amount, for example 120000.95: ");

    double loanAmount = Double.parseDouble(loanString);

    double monthlyPayment = (loanAmount * monthlyInterestRate)/(1-(1)/(Math.pow(1+monthlyInterestRate,numberOfYears*12)));
    double totalPayment = monthlyPayment * numberOfYears*12;

    //Keeping 2 digits after decimal point
    monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
    totalPayment = (int)(totalPayment * 100) / 100.0;

    String output = "The monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment;
    JOptionPane.showMessageDialog(null, output);
    /*

    Scanner input = new Scanner(System.in);

    System.out.println("Enter annual interest rate: ");
    double annualInterestRate = input.nextDouble();
    double monthlyInterestRate = annualInterestRate / 1200;

    System.out.println("Enter number of years: ");
    int numberOfYears = input.nextInt();

    System.out.println("Enter loan amount: ");
    double loanAmount = input.nextDouble();

    //Calculate payment
    double monthlyPayment = (loanAmount * monthlyInterestRate)/(1-(1)/(Math.pow(1+monthlyInterestRate,numberOfYears*12)));
    double totalPayment = monthlyPayment * numberOfYears*12;
    //System.out.println(monthlyPayment);
    //System.out.println(totalPayment);
    //Disp results
    System.out.println("The monthly payment is: "+(int)(monthlyPayment*100)/100.0);
    System.out.println("The total payment is: "+(int)(totalPayment*100)/100.0);
    */
  }
}