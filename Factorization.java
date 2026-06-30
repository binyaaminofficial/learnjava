import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        List<Integer> factors = getPrimeFactors(n);
        System.out.println("Prime factors: " + factors);
    }

    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        
        if (n > 2) {
            factors.add(n);
        }
        
        return factors;
    }
}