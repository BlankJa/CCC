import java.util.Scanner;
public class IconScaling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o = input.nextInt();
        String output = "";
        String[] icon={"*x*"," xx","* *"};
        for(String str: icon){
            for(int j = 0; j < o; j++){
                output="";
                for(char k : str.toCharArray()){
                    for(int i = 0; i < o; i++){
                        output+=k;
                    }
            }
            System.out.println(output);    
            }
        }
        
    }
}
