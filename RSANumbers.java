import java.util.Scanner;
public class RSANumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int overallcount = 0;
        int count;
        for(int i =a; i<=b;i++){
            count=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(Math.sqrt(i)!=Math.floor(Math.sqrt(i))&&i%j==0){
                        count+=1;
                    
                }
            }
            if(count==1){
                overallcount+=1;
            }
        }
        System.out.printf("The number of RSA numbers between %d and %d is %d\n",a,b,overallcount);

    }
}
