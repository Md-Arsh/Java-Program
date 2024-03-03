import java.util.Scanner;

class GCD {
    public static void main(String args[]) {
        int xrr[] = new int[13];
        int yrr[] = new int[9];
        int zrr[] = new int[4];
        int i, j, k = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int x = sc.nextInt();
        System.out.println("Enter number: ");
        int y = sc.nextInt();

        // Find common divisors
        for (i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                zrr[k] = i;
                k++;
            }
        }

        // Find the maximum value in zrr array
        int gcd = zrr[0];
        for (i = 1; i < k; i++) {
            if (zrr[i] > gcd) {
                gcd = zrr[i];
            }
        }

        System.out.println("Greatest common factor is " + gcd);
    }
}
