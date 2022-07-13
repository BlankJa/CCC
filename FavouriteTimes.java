import java.util.*;
public class FavouriteTimes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int[] Num;
        int count = 31*(time/720);
        for(int i = 0; i<=time%720;i++){
            Num = toDigit(i);
            count+=isArithmeticSequence(Num);
        }
        System.out.println(count);
    }
    public static int[] toDigit(int time){
        int hour = time/60%12;
        int min = time%60;
        if(hour == 0){
            hour = 12;
        }
        int a = min%10;
        int b = min/10;
        int c = hour%10;
        int d = hour/10;
        int[] Num = {d,c,b,a};
        return Num;
    }
    public static int isArithmeticSequence(int[] num){
        int a = num[2]-num[1];
        // int start;
        // if(num[0]==0) start = 1;
        // else start = 0;
        int start = num[0]==0?1:0;
        for(int i = start; i<num.length-1;i++){
            if(!(num[i+1]-num[i]==a)){
                return 0;
            }
        }
        return 1;
    }
}
