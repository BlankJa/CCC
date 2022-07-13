import java.util.Scanner;
public class MouseJourney {
    public static int m,n,cnt=0;
    public static int[][] cats;
    public static int[][] dir = {{1,0},{0,1}};
    public static int[][] vis;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        int k = input.nextInt();
        vis = new int[m*n][2];
        cats = new int[k][2];
        for(int i = 0; i < k; i++){
            cats[i][0] = input.nextInt();
            cats[i][1] = input.nextInt();
        }
        vis[0][0] = 1;
        vis[0][1] = 1;
        dfs(1,1,1);
        System.out.println(cnt);
    }

    public static void dfs(int r, int c, int d){
        if(r == m && c == n){
            cnt++;
            return;
        }
        for(int i = 0; i<2;i++){
            int nr = r+dir[i][0];
            int nc = c + dir[i][1];
            if(nr<=m && nc<=n && !contains(nr,nc,cats) && !contains(nr,nc,vis)){
                vis[d][0] = nr;
                vis[d][1] = nc;
                dfs(nr,nc,d+1);
                vis[d][0] = 0;
                vis[d][1] = 0;
            }
        }
    }


    public static boolean contains(int r, int c, int[][] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i][0] == r && arr[i][1] == c){
                return true;
            }
        }
        return false;
    }

}
