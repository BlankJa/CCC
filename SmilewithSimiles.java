import java.util.Scanner;

public class SmilewithSimiles{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String o = input.next();
        String p = input.next();
        int n = Integer.parseInt(o);
        int m = Integer.parseInt(p);
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            String str = input.next();
            s[i] = str;
        }
        for(int i = 0; i < m; i++){
            String str = input.next();
            for(int j = 0; j < n; j++){
                System.out.printf("%s as %s\n", s[j], str);
            }
        }
    }
}
