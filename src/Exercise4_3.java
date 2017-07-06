

public class Exercise4_3 {
  public static void main(String[] args) {
    final double OUNCES_IN_GRAMS = 0.035;
    System.out.println("Grams \t\t\tOunces");

    for(int i = 1; i < 200; i = i+2){
    double t = (double)Math.round(OUNCES_IN_GRAMS * 1000d) / 1000d;
      System.out.println(i + "\t\t\t" + (double)Math.round((i * t) * 1000d) / 1000d);
    }
  }
}
