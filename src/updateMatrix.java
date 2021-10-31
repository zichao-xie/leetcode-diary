import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xzc
 * @version 1
 * @time 2021/10/30 21:05
 * @number 542
 */
public class updateMatrix {
    /**
     * @author  xzc
     * @date  2021/10/30 21:53
     * @time  72.88
     * @memory  90.32
     * @description  bfs。首先找到所有的0放入队列，然后将1变为-1，防止与距离弄混（因为要在原数组里存储）
     * 如果为-1表示这个1未被访问过，则距离为当前点的距离+1；
     */
    public int[][] updateMatrix(int[][] mat) {
        Queue<int []> queue = new LinkedList<>();
        int n = mat.length, m = mat[0].length;
        for (int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if (mat[i][j]==0){
                    queue.offer(new int[]{i,j});
                }else {
                    mat[i][j] = -1;
                }
            }
        }
        int [] dx = {0,0,1,-1};
        int [] dy = {1,-1,0,0};
        while (!queue.isEmpty()){
            int [] point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<m && mat[nx][ny]==-1){
                    mat[nx][ny] = mat[point[0]][point[1]]+1;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
        return mat;
    }

    /**
     * @author  xzc
     * @date  2021/10/31 20:25
     * @time  99.47
     * @memory  56.78
     * @description 递归。分为四个方向，但是可以简化为左上和右下，不知道怎么证明。
     */
    public int[][] updateMatrix2(int[][] mat) {
        int n = mat.length,m = mat[0].length;
        int [][] dist = new int[n][m];
        for (int i=0;i<n;i++) {
            Arrays.fill(dist[i],Integer.MAX_VALUE/2);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j]==0)
                    dist[i][j]=0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i>0)
                    dist[i][j] = Math.min(dist[i][j],dist[i-1][j]+1);
                if (j>0)
                    dist[i][j] = Math.min(dist[i][j],dist[i][j-1]+1);
            }
        }

        for (int i = n-1; i >=0 ; i--) {
            for (int j=m-1;j>=0;j--){
                if (i<n-1)
                    dist[i][j] = Math.min(dist[i][j],dist[i+1][j]+1);
                if (j<m-1)
                    dist[i][j] = Math.min(dist[i][j],dist[i][j+1]+1);
            }
        }
        return dist;
    }

}
