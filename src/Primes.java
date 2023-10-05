
public class Primes {
    public static void main(String[] args) {
        int nValues = 50;

        outerLoop:
        for (int i = 2; i <= nValues; i++) {
            // Check if i is prime
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    // i is not prime, so continue to the next number
                    continue outerLoop;
                }
            }
            // If we reach this point, i is prime
            System.out.println(i);
        }
    }
}

