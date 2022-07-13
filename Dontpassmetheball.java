import java.util.*;
public class Dontpassmetheball {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = ((num-1)*(num-2)*(num-3))/6;
        System.out.println(a);
    }
}
