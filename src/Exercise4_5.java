

public class Exercise4_5 {
  public static void main(String[] args) {
    final double OUNCES_IN_GRAMS = 0.035;
    System.out.println("Grams \t\t\tOunces \t\t\tOunces \t\t\tGrams");

    for(int i = 1, j = 5; i < 200 && j < 501; i += 2, j += 5){
      double t = (double)Math.round(OUNCES_IN_GRAMS * 1000d) / 1000d;
      System.out.println(i + "\t\t\t" + ((double)Math.round((i * t) * 1000d) / 1000d) + "\t\t\t" + j + "\t\t\t" + ((double)Math.round((j / OUNCES_IN_GRAMS) * 1000d) / 1000d));
    }
  }
}
