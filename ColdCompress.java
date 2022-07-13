import java.util.Scanner;
public class ColdCompress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int n = Integer.parseInt(a);
        String[] b = new String[n];
        int q = -1;
        for(int i =0; i<n;i++){
            b[i] = input.nextLine();
        }
        for(int e = 0; e<n;e++){
            for(int j = 0; j<b[e].length();j++){
                if(j<(b[e].length())-1){
                    if(b[e].charAt(j)!=b[e].charAt(j+1)){
                        System.out.print(j-q+" "+b[e].charAt(j)+" ");
                        q=j;
                    }
                }else{
                    System.out.print(j-q+" "+b[e].charAt(j));
                }
            }
            System.out.println();
            q=-1;
        }
    }
}
