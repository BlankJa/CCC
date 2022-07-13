import java.util.*;
public class Rövarspråket {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String letter = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiou";
        String output = "";
        int a = 0;
        int e = 4;
        int i = 8;
        int o = 14;
        int u = 20;
        Integer[] arr2 = {a,e,i,o,u};
        for(int j = 0; j < str.length(); j++){
            
            output += str.charAt(j);
            if(!vowels.contains(String.valueOf(str.charAt(j)))){
                int q = letter.indexOf(str.charAt(j));
                //把q转换为Integer类型
                Integer q1 = q;
                MyComparator cmp = new MyComparator(q1);
                Arrays.sort(arr2,cmp);
                
                // int[] arr = new int[5];
                // arr[0] = Math.abs(q-a);
                // arr[1] = Math.abs(q-e);
                // arr[2] = Math.abs(q-i);
                // arr[3] = Math.abs(q-o);
                // arr[4] = Math.abs(q-u);
                // int m = 0;
                // for(int k = 0; k < 5; k++){
                //     if(arr[k]<arr[m]){
                //         m = k;
                //     }
                // }
                output += letter.charAt(arr2[0]);
                if(q!=25)q+=1;
                if(q==a||q==e||q==i||q==o||q==u){
                    q+=1;
                }
                output+=letter.charAt(q);
            }
        }
        System.out.println(output);
        

    }
}
class MyComparator implements Comparator<Integer>{
    Integer s;
    public MyComparator(Integer q){
        s=q;
    }
     public int compare(Integer a, Integer b){
         return Math.abs(a-s)-Math.abs(b-s);

     }
}