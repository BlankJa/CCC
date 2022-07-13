import java.util.Scanner;
public class SumacSequences{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c,count = 2;
        do{
            c = a-b;
            count++; 
            a = b;
            b = c;
        }while(b<=a);
            
        
        
        System.out.println(count);
    }
}
