import java.util.*;
public class alphabeticalsearch {
    public static int cnt = 1;
    public static int maxCnt = 0;
    public static int[] [] dir =  {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] matrix = new char[n][m];
        for(int i = 0; i<n;i++){
            matrix[i] = input.next().toCharArray();
        }
        boolean[] vis = new boolean[26];
        vis[matrix[0][0] - 'A'] = true;
        dfs(matrix, 0, 0, vis);
        System.out.println(maxCnt);
    }

    public static void dfs(char[][] matrix, int r, int c, boolean[] vis){
        for(int i = 0; i < 4; i++){
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];
            if(nr < 0 || nr >= matrix.length || nc < 0 || nc >= matrix[0].length){
                continue;
            }
            char ch = matrix[nr][nc];
            int index = ch - 'A';
            if(!vis[index]){
                cnt++;
                vis[index] = true;
                dfs(matrix, nr,nc,vis);
                vis[index] = false;
                cnt--;
            }
        }
        maxCnt = maxCnt > cnt ? maxCnt : cnt;
    }
}
