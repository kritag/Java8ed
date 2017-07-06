

public class Exercise4_6 {
  public static void main(String[] args) {
    final double KILOMETERS_PER_MILE = 1.609;
    System.out.println("Miles \t\t\tKilometers \t\t\tKilometers \t\t\tMiles");

    for(int i = 1, j = 20; i < 11 && j < 66; i += 1, j += 5){
      double t = (double)Math.round(KILOMETERS_PER_MILE * 1000d) / 1000d;
      System.out.println(i + "\t\t\t" + ((double)Math.round((i * t) * 1000d) / 1000d) + "\t\t\t" + j + "\t\t\t" + ((double)Math.round((j / t) * 1000d) / 1000d));
    }

  }
}
