import java.util.Scanner;

public class Escape {
    public static int m, n, r0, r1, c0, c1;
    public static int[][] room;
    public static boolean[][] vis;
    public static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    public static int[][] way;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        room = new int[m][n];
        vis = new boolean[m][n];
        way = new int[m * n][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                room[i][j] = input.nextInt();
            }
        }
        r0 = input.nextInt() - 1;
        c0 = input.nextInt() - 1;
        r1 = input.nextInt() - 1;
        c1 = input.nextInt() - 1;
        vis[r0][c0] = true;
        way[0][0] = r0;
        way[0][1] = c0;
        dfs(r0, c0, 0);
    }

    public static void dfs(int r, int c, int d) {
        if (r == r1 && c == c1) {
            for (int i = 0; i < d - 1; i++) {
                System.out.printf("(%d, %d)->", way[i][0], way[i][1]);
            }
            System.out.printf("(%d, %d)\n", way[d - 1][0], way[d - 1][1]);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];

            if (nr >= 0 && nc >= 0 && nr < m && nc < n &&
                    room[nr][nc] == 1 && !vis[nr][nc]) {
                vis[nr][nc] = true;
                way[d][0] = nr + 1;
                way[d][1] = nc + 1;
                dfs(nr, nc, d + 1);
                vis[nr][nc] = false;
            }
        }
    }
}
