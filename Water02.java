import java.util.Scanner;
public class Water02{
    public static char[][] water;
    public static int[][] dir = {
        {-1,0},{1,0},{0,-1},{0,1},
        {1,1},{1,-1},{-1,1},{-1,-1}
    };
    public static int m,n;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();
        water = new char[n][m];
        for(int i = 0; i < n; i++){
            water[i] = input.next().toCharArray();
        }
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(water[i][j] == 'W'){
                    dfs(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    public static void dfs(int r, int c){
        for(int i = 0; i<8;i++){
            int nr = r+dir[i][0];
            int nc = c+dir[i][1];
            if(nr>=0 && nr<n && nc>=0 && nc<m && water[nr][nc]=='W'){
                water[nr][nc] = '.';
                dfs(nr,nc);
            }
        }
    }
}
