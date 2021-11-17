/**
 * @author xzc
 * @version 1
 * @time 2021/11/17 17:24
 * @number 566
 */
public class matrixReshape {
    /**
     * @author  xzc
     * @date  2021/11/17 19:34
     * @time  100
     * @memory  34
     * @description
     */
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int or = mat.length;
        int oc = mat[0].length;
        if (r*c!=or*oc) return mat;
        int [][] ans = new int[r][c];
        for (int i=0,cnt=0;i<or;i++) {
            for (int j = 0; j < oc; j++,cnt++) {

                ans[cnt/c][cnt%c] = mat[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        matrixReshape(new int[][]{{1,2},{3,4}},1,4);
    }

}
