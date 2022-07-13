import java.util.Scanner;

public class TimetoDecompress{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int n = Integer.parseInt(a);
        System.out.println();
        String[] b = new String[n];
        for(int i =0; i<n;i++){
            //int num = input.nextInt();
            //String s = input.next();
            String s = input.nextLine();
            int num = Integer.parseInt(s.substring(0,s.indexOf(" ")));
            String str = s.substring(s.indexOf(" ")+1);
            String p = "";
            for(int j =0; j<num;j++){
                p+=str;
            }
            b[i] = p;
        }
        for(int e = 0; e<b.length;e++){
            System.out.println(b[e]);
        }
    }
}
