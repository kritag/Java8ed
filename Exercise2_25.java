import java.util.Scanner;

public class Exercise2_25{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a time zone offset to GMT: ");
    int offset = input.nextInt();

    long totalMilliSeconds = System.currentTimeMillis();
    long totalSeconds = totalMilliSeconds / 1000;
    long currentSecond = totalSeconds%60;
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHour = totalHours%24;
    long currentHouroffset = currentHour + offset;

    System.out.println("Current time is "+ currentHouroffse+t":"+currentMinute+":"+currentSecond+" GMT " + offset);
  }
}