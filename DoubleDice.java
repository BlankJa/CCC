import java.util.Scanner;
public class DoubleDice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int scoreA=100, scoreB=100;
        for(int i = 0; i<n;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            if(a<b){
                scoreA-=b;
            }else if(a>b){
                scoreB-=a;
            }
        }
        System.out.println(scoreA);
        System.out.println(scoreB);
    }
}
