import javax.swing.JOptionPane;

public class Exercise3_18{
  public static void main(String[] args) {
    String year = JOptionPane.showInputDialog(null, "Leap year calculator", "Enter a year: ", JOptionPane.QUESTION_MESSAGE);
    int stringYear = Integer.parseInt(year);

    boolean isLeapYear = (stringYear % 4 == 0 && stringYear % 100 != 0) || (stringYear % 400 == 0);

    JOptionPane.showMessageDialog(null, stringYear + " is a leap year? " + isLeapYear);

  }
}