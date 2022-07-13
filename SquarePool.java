import java.util.Scanner;
public class SquarePool {
    public static int n,t,maxCnt=0,cnt=1;
    public static int[][] yard;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        t = input.nextInt();
        yard = new int[n+1][n+1];
        for(int i = 0; i<t;i++){
            yard[input.nextInt()][input.nextInt()] = 1;
        }
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n;j++){
                if(yard[i][j]==0){
                    cnt=1;
                    dfs(i,j);
                }
            }
        }
        System.out.println(maxCnt);
    }

    public static void dfs(int r, int c){
  
        int nr = r+1;
        int nc = c+1;
  
        if(nr<=n && nc <=n && yard[nr][nc]==0){
            int q = 0;
            for(int i = 1; i<=cnt; i++){
                q+=yard[nr][nc-i];
                q+=yard[nr-i][nc];
            }
            if(q==0){
                cnt++;

                dfs(nr,nc);
            }else{
                maxCnt = Math.max(maxCnt,cnt);
            }
        }else{
            maxCnt = Math.max(maxCnt,cnt);
        }
        
    }
}
