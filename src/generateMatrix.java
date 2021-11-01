/**
 * @author xzc
 * @version 1
 * @time 2021/11/1 19:54
 * @number 59
 */
public class generateMatrix {
    /**
     * @author  xzc
     * @date  2021/11/1 20:05
     * @time  100
     * @memory  80.08
     * @description  用左上和右下确定一个圆。
     */
    public int[][] generateMatrix(int n) {
        int [][] ans = new int[n][n];
        circle(0,0,n-1,n-1,1,ans);
        return ans;
    }

    public void circle(int x1, int y1, int x2, int y2, int val, int [][] ans){
        if (x2<x1 || y1>y2) return;
        if (x1==x2) {
            ans[x1][y1] = val;
            return;
        }

        for (int i = y1; i < y2 ; i++) ans[x1][i]=val++;
        for (int i = x1; i < x2 ; i++) ans[i][y2]=val++;
        for (int i = y2; i > y1 ; i--) ans[x2][i]=val++;
        for (int i = x2; i > x1 ; i--) ans[i][y1]=val++;
        circle(x1+1,y1+1,x2-1,y2-1,val,ans);
    }

    /**
     * @author  xzc
     * @date  2021/11/1 20:34
     * @time  100
     * @memory  32.47
     * @description  定义四个方向。
     */
    public int[][] generateMatrix2(int n) {
        int [][] ans = new int[n][n];
        int [][] dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        for (int x=0,y=0,d=0,i=1;i<=n*n;i++){
            ans[x][y] = i;
            int nx = x+dirs[d][0], ny = y+dirs[d][1];
            if (nx<0 || nx>=n || ny<0 || ny>=n || ans[nx][ny]!=0){
                d = (d+1)%4;
                nx = x + dirs[d][0];
                ny = y + dirs[d][1];
            }
            x= nx;
            y=ny;
        }
        return ans;
    }
}
