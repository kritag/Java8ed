

public class Exercise4_4 {
  public static void main(String[] args) {
    final double KILOMETERS_PER_MILE = 1.609;
    System.out.println("Miles \t\t\tKilometers");

    for(int i = 1; i < 11; i++){
    double t = (double)Math.round(KILOMETERS_PER_MILE * 1000d) / 1000d;
      System.out.println(i + "\t\t\t" + (double)Math.round((i * t) * 1000d) / 1000d);
    }
  }
}
