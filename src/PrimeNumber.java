

public class PrimeNumber {
  public static void main(String[] args) {
    final int NUMBER_OF_PRIMES = 50;
    final int NUMBER_OF_PRIMES_PER_LINE = 10;

    int count = 0;
    int number = 2;

    System.out.println("The first 50 prime numbers are: ");
    while (count < NUMBER_OF_PRIMES){
      boolean isPrime = true;

      for(int div = 2; div <= number / 2; div++){
        if(number % div == 0){
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        count++;

      if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
        System.out.println(number);
      }
      else
        System.out.println(number + " ");
      }
      number++;
    }
  }
}
