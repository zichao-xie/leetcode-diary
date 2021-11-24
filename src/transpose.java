/**
 * @author xzc
 * @version 1
 * @time 2021/11/24 21:09
 * @number 867 (726还没做)
 */
public class transpose {
    /**
     * @author  xzc
     * @date  2021/11/24 21:12
     * @time  100
     * @memory 26.46
     * @description ...
     */
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int [][] ans = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
