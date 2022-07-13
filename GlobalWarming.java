import java.util.*;

public class GlobalWarming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            int n = input.nextInt();
            if(n==0) break;
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = input.nextInt();
            }
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            int[] tempd = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                tempd[i] = temp[i + 1] - temp[i];
            }

            for (int i = 1; i <= n - 1; i++) {
                boolean flag = true;
                for (int j = i; j < n - 1; j++) {
                    if (tempd[j] != tempd[j % i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    continue;
                } else {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
