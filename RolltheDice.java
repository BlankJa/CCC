import java.util.Scanner;
public class RolltheDice {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int count=0;
        for(int i = 1; i<=m;i++){
            for(int j = 1; j<=n;j++){
                if(i+j==10){
                    count+=1;
                }
            }
        }
        if(count==1){
             System.out.printf("There is %d way to get the sum 10.\n",count);
        }else{
            System.out.printf("There are %d ways to get the sum 10.\n",count);
        }
       
    }
}
