import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/29 10:31
 * @number 695
 */

public class maxAreaOfIsland {

    /**
     * @author  xzc
     * @date  2021/10/29 14:59
     * @time  99.99
     * @memory  38.88
     * @description  dfs
     */
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]==1)
                    max = Math.max(dfs(grid,i,j),max);
            }
        }
        return max;
    }

    public  int dfs(int [][] grid,int x,int y){
        grid[x][y]=0;
        int [] dx = {0,0,-1,1};
        int [] dy = {1,-1,0,0};
        int ans = 1;
        for (int i=0;i<4;i++){
            int mx = x + dx[i],my = y + dy[i];
            if (mx>=0 && mx<grid.length && my>=0 && my<grid[0].length && grid[mx][my]==1){
                ans+=dfs(grid,mx,my);
            }
        }
        return ans;
    }
}
