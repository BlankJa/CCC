import java.util.*;
public class Money {
    public static int n;
    public static int[][] data;
    public static boolean[] vis;
    public static int cnt = 0;
    public static int maxCnt = 0;
    public static int[] choice;
    public static int[] maxChoice;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        data = new int[n][n];
        vis = new boolean[n];
        choice = new int[n];
        maxChoice = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                data[i][j] = input.nextInt();
            }
        }
        dfs(0);
        for(int k = 0; k<n;k++){
            System.out.printf("%c:J%d ",k+'A', maxChoice[k]+1);
        }
        System.out.println();
        System.out.printf("总效益: %d\n",maxCnt);
    }
    public static void dfs(int p){
        if(p == n){
            if(maxCnt < cnt ){
                maxCnt = cnt;
                maxChoice = choice.clone();
            }
            return;
        }
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                cnt += data[p][i];
                vis[i] = true;
                choice[p] = i;
                dfs(p+1);
                cnt -= data[p][i];
                vis[i] = false;
            }
        }
    }
}
