import java.util.Scanner;
import java.util.Stack;
public class ZeroThatOut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack<Integer>  s = new Stack<Integer>();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int o = input.nextInt();
            if(o==0){
                s.pop();
            }else{
                s.push(o);
            }
        }
        int p = 0;
        while(!s.isEmpty()){
            p+=s.pop();
        }
        System.out.println(p);
    }
}
