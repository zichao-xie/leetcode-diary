import java.util.Arrays;

/**
 * @author xzc
 * @version 1
 * @time 2021/11/2 21:10
 * @number 73
 */
public class setZeroes {
    /**
     * @author  xzc
     * @date  2021/11/2 21:38
     * @time  98.15
     * @memory  84.37
     * @description  首先遍历首行，首列，判断是否有零并记录下来。
     * 遍历其他位置，如果为0，则记录到对应的首行和首列
     * 根据首行首列，将对应的行和列置零
     * 根据第一步记录的首行首列是否有0，将首行和首列置零。
     */
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean r0 = false, c0 = false;

//        行首，行尾是否置零
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                r0 = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[0][i]==0){
                c0 = true;
                break;
            }
        }

//      将其他位置的零记录到行首行尾
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        //        根据行首，行尾的记录，对非行首行尾置零
        for (int i = 1; i < n; i++) {
            if (matrix[i][0]==0){
                Arrays.fill(matrix[i],0);
            }
        }

        for (int i = 1; i < m; i++) {
            if (matrix[0][i]==0){
                for (int j = 1; j < n; j++) {
                    matrix[j][i]=0;
                }
            }
        }
//        置零行首行尾
        if (r0) for (int i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
        if (c0)
            Arrays.fill(matrix[0],0);
    }
}
