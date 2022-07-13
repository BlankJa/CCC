import java.util.Scanner;
public class From1987to2013 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String year = input.nextLine();
        int YEAR;
        YEAR = Integer.parseInt(year);
        YEAR++;
        year = Integer.toString(YEAR);
        while(true){
            boolean e = true;
            for(int i = 0; i<year.length();i++){
                char a = year.charAt(i);
                int countA = AppearNum(year,a);
                if(countA != 1){
                    e = false;
                }
            }
            if(e == true){
                System.out.println(year);
                break;
            }else{
                YEAR = Integer.parseInt(year);
                YEAR++;
                year = Integer.toString(YEAR);
            }
        }
       
        
    }

    public static int AppearNum(String year, char l){
        int count = 0;
        for(int i = 0; i<year.length(); i++){
            if(year.charAt(i)==l){
                count++;
            }
        }
        return count;
    }
}
