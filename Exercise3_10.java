import javax.swing.JOptionPane;

public class Exercise3_10 {
    public static void main(String[] args) {
        int answer;
        String answerString;
        int number2;
        int number1 = (int)(Math.random() * 10.0);
        String replyString = number1 + (number2 = (int)(Math.random() * 10.0)) == (answer = Integer.parseInt(answerString = JOptionPane.showInputDialog("What is " + number1 + " + " + number2 + "?"))) ? "You are correct!" : "Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2);
        JOptionPane.showMessageDialog(null, replyString);
    }
}