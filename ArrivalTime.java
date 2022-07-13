import java.util.*;
public class ArrivalTime {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String startTime = input.next();
        int n = timeToNum(startTime);
        for(int i = 0; i<120; i++){
            if((420<=n && n<600) || (900<=n && n<1140)){
                n+=2;
            }else n+=1;
        }
        System.out.println(numToTime(n));
   } 
   public static int timeToNum(String time){
    //    int hour = Integer.parseInt(time.substring(0,2));
    //    int min = Integer.parseInt(time.substring(3,5));
        String[] timeArray = time.split(":");
        int hour = Integer.parseInt(timeArray[0]);
        int min = Integer.parseInt(timeArray[1]);
       int num = hour*60+min;
       return num;
   }
   public static String numToTime(int num){
       int hour = num/60%24;
       int min = num%60;
    //    if (hour>=24){
    //        hour-=24;
    //    }
        
       return String.format("%02d:%02d",hour,min);
    }
}
