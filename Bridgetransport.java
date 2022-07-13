import java.util.Scanner;

public class Bridgetransport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int n = input.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = input.nextInt();
        }
        int p = 0;

        for (int k = 0; k < 3; k++) {
            p += t[k];
            if (p > w) {
                System.out.println(k);
                return;
            }
        }

        for (int j = 0; j < n - 3; j++) {
            if (t[j] + t[j + 1] + t[j + 2] + t[j + 3] > w) {
                System.out.println(j + 3);
                return;
            }
        }
        System.out.println(n);
    }

}
