import java.util.Scanner;
public class DFS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] graph = new int[n+1][n+1];
        for(int i = 0; i<m;i++){
            int x = input.nextInt();
            int y = input.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        int[] visit = new int[n+1];
        visit[1] = 1;
        dfs(graph, visit, 1);
        
    }
    
    public static void dfs(int[][] graph, int[] visit, int cur){
        System.out.println(cur);
        for(int i = 1; i < graph.length; i++){
            if(graph[cur][i] == 1 && visit[i]!=1){
                visit[i] = 1; 
                dfs(graph,visit, i);
            }
        }
    }
}
