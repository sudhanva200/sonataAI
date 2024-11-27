package EXP1;

import java.util.Scanner;

public class eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    public static void sieve(int n, boolean[] primes) {
        for(int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
